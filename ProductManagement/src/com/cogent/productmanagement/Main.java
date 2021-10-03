package com.cogent.productmanagement;

import java.util.Date;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		//variables
		String Id = "ab001";
		String name = "abhi";
		float productPrice = 0;
		long qty = 0;
		Date createdDate;
		Date expiryDate;
		String batchNo = "33";
		
		//ProductService productService =  ProductServiceImpl.getInstance();
		ProductService productService = ProductServiceImpl.getInstance();
		Product product1 = new Product(Id, name, productPrice, qty, null, null, batchNo);
		Product[] products = productService.getProducts();
		Product productId = productService.getProductById(Id);
		
		//Update an record
		productService.updateProduct(Id, product1);
		
		//delete a product record
		productService.deleteProductById(Id);
		
		//Delete all product records
		productService.deleteAllProducts();
		
		
		//print out the products listed
		for(Product p : products) {
			System.out.println(p);
		}
		
	}

}
