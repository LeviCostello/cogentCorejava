package com.cogent.productmanagement.service;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

	ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	public static ProductService productService;
	
	public static ProductService getInstance() {
		if(productService==null) {
			productService = new ProductServiceImpl();
			return productService;
		}
		return productService;
	}
	
	@Override
	public String addProduct(Product product) {
		return productRepository.addProduct(product);
	}

	@Override
	public String updateProduct(String productId, Product product) {
		return productRepository.updateProduct(productId, product);
	}

	@Override
	public Product getProductById(String id) {
		return productRepository.getProductById(id);
	}

	@Override
	public Product[] getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public String deleteProductById(String id) {
		return productRepository.deleteProductById(id);
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAllProducts();
		
	}

}
