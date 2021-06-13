import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './products.model';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
   

  private produrl:string = "http://localhost:9000/kitchenstoryapi/product/";
  

  constructor(private httpClient:HttpClient) {}

    //get all food products
    public getProducts()
    {
      return this.httpClient.get(this.produrl);
    }

    //get products by name
    public getProductsByName(productname:string)
    {
      return this.httpClient.get(this.produrl + productname);
    }

    //add new food product
    public addProduct(product:Product)
    {
      return this.httpClient.post(this.produrl,product);
    }

    //update a product
    public updateProduct(product:Product)
    {
      return this.httpClient.put(this.produrl, product);
    }

    //delete a product
    public deleteProduct(id:string)
    {
      return this.httpClient.delete(this.produrl + id);
    }
   }

