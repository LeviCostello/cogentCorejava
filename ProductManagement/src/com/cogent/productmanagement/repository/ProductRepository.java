package com.cogent.productmanagement.repository;

import java.io.IOException;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public interface ProductRepository {

	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException;
	public Product getProductById(String id) throws IOException, InvalidProductIdException;
	public Product[] getProducts();
	public String deleteProductById(String id) throws InvalidProductIdException, IOException;
	public void deleteAllProducts();
}
