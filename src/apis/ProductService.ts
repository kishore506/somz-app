import http from '@/http-shared'

/* eslint-disable */
class ProductDataService {
  getAll(): Promise<any> {
    return http.get('/products')
  }

  get(pid: any): Promise<any> {
    return http.get(`/products/${pid}`)
  }

  create(data: any): Promise<any> {
    return http.post('/products', data)
  }

  update(pid: any, data: any): Promise<any> {
    return http.put(`/products/${pid}`, data)
  }

  delete(pid: any): Promise<any> {
    return http.delete(`/products/${pid}`)
  }

  deleteAll(): Promise<any> {
    return http.delete(`/products`)
  }

  findByModel(model: string): Promise<any> {
    return http.get(`/products?model=${model}`)
  }
}

export default new ProductDataService()
