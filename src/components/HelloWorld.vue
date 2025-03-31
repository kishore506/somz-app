<script setup lang="ts">
defineProps<{
  msg: string
}>()
</script>

<template>
  <div class="greetings">
    <h1 class="green">{{ msg }}</h1>
    <h3>
      SOMZ 25 - Sales Order Processing System
      <!--
        <a href="https://vite.dev/" target="_blank" rel="noopener">Vite</a> +
        <a href="https://vuejs.org/" target="_blank" rel="noopener">Vue 3</a>. What's next?
      -->
    </h3>
  </div>
</template>

<style scoped>
h1 {
  flex: float;
  font-weight: 300;
  font-size: 1.2rem;
  position: relative;
  top: -10px;
}

h3 {
  flex: float;
  font-size: 0.9rem;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
