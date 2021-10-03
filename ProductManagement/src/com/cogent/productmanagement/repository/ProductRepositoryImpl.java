package com.cogent.productmanagement.repository;

import java.io.IOException;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	private Product products[] = new Product[10];
	
	private static ProductRepository productRepository;
	
	private ProductRepositoryImpl() {
		
	}
	
	public static ProductRepository getInstance() {
		if(productRepository==null) {
			productRepository = new ProductRepositoryImpl();
			return productRepository;
		}
		return productRepository;
	}
	
	private int getIndex(Product product) {
		for (int i = 0; i < products.length; i++) {
			if(products[i].equals(product)) {
				return i;
			}
		}
		return -1;
	}
	
	static int counter = 0;
	
	public String addProduct(Product product) {
		if(counter >= products.length) {
			return "array is full";
		}
		products[counter++] = product;
		return "success";
	}

	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException {
		this.getProductById(productId);
		int index = this.getIndex(product);
		products[index] = product;
		return "success";
	}

	public Product getProductById(String id) throws InvalidProductIdException, IOException {
		for(Product product: products) {
			if(product != null && id.equals(product.getProductId())) {
				throw new IOException();
				//return product;
			}
		}
		throw new InvalidProductIdException("id not found");
		//return null;
	}

	public Product[] getProducts() {
		return products;
	}

	public String deleteProductById(String id) throws InvalidProductIdException, IOException {
		Product product = this.getProductById(id);
		int index = this.getIndex(product);
		if(index != -1) {
			products[index] = null;
			return "Deletion sucess";
		}else {
			return "not found";
		}
	}

	public void deleteAllProducts() {
		products = null;
		
	}


}
