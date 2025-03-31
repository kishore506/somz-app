<template>
  <div class="product">
    <h1>This is Product page</h1>
  </div>
  <thead>
    <button>[ ADD ]</button>
    <tr v-if="products.length > 0">
      <td v-for="column in columns" :key="column">
        {{ column }}
      </td>
    </tr>
  </thead>
  <ol>
    <li v-for="prod in products" :key="prod.id">
      {{ prod }}
      <button>[ Update ]</button>
      <button>[ Delete ]</button>
    </li>
  </ol>
  <button v.on:click="javascript.alert('bye')">ListProducts</button>
</template>

<script setup lang="ts">
import { onMounted, watch, reactive } from 'vue'
import axios from 'axios'
import type IProduct from '../types/IProduct.ts'

const columns = [
  '  |  id ',
  '  |  model ',
  '  |  price ',
  '  |  sku',
  '  |  stock',
  '  |   disco',
  '  |',
  // "thumbnail",
]

class Product implements IProduct {
  id: string = '0'
  model: string = 'm'
  descr: string = 'd'
  price: number = 1
  sku: number = 1
  stock: number = 1 // available quantity
  disco: number = 1
}

const products = reactive<Product[]>([
  {
    id: '0',
    model: 'm',
    descr: 'd',
    price: 1,
    sku: 1,
    stock: 1,
    disco: 1,
  },
])

onMounted(async () => {
  const { data, status } = await axios.get('http://localhost:3000/products/')
  console.log(data)
  console.log(status)
  // products.values = <Product[]> data;

  while (products.length > 0) products.pop() // remove
  data.map((a: Product) => {
    products.push(a)
  })
})

watch(products, (newValue, oldValue) => {
  console.log('new value')
  newValue.map((x) => console.log(x))
  console.log('Old Old value')
  oldValue.map((y) => console.log(y))
})
</script>

<style lang="scss" scoped>
@media (min-width: 1024px) {
  .product {
    min-height: 200vh;
    display: flex;
    align-items: center;
  }
}

button {
  background-color: aquamarine;
}

table {
  thead {
    background-color: #15310e;

    tr {
      td {
        font-weight: bold;
      }
    }
  }

  tr {
    td {
      padding: 5px 10px;
    }
  }

  tr:nth-child(even) {
    background-color: #f4a2a2;
  }
}
</style>
