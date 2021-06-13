package com.products.service;

import java.util.List;

import com.products.model.Products;
//import com.products.model.Users;

public interface ProductsCrudService {
	
	public Products createProduct(Products product);
	public Products updateProduct(int id, Products product);
	public List<Products> getProductByName(String productname);
	public List<Products> getAllProducts();
	public void deleteProductById(int id);
	//public Products updatecategory(int id, Products product);

}
