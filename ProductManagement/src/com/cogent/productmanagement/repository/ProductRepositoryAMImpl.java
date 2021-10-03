package com.cogent.productmanagement.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public class ProductRepositoryAMImpl implements ProductRepository{

	private ArrayList<Product> products = new ArrayList<>();
	//10 employees
	//when we will add 11th one then it will increase the sieze automattically 
	//set growable
	
	//<Employee> ==> we are informing that we will hold only Employees type objects
	
	private static ProductRepository productRepository;
	
	private ProductRepositoryAMImpl() {
		
	}
	
	public static ProductRepository getInstance() {
		if(productRepository==null) {
			productRepository = new ProductRepositoryAMImpl();
			return productRepository;
		}
		return productRepository;
	}
	@Override
	public String addProduct(Product product) {
		boolean status = products.add(product);
		if(status)
			return "success";
		else
			return "fail";
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String id) throws IOException, InvalidProductIdException {
		//1. we need to traverse the arraylist
		for(Product product : products) {
			if(id.equals(product.getProductId())) {
				return product;
			}
		}
		//2. we need to use java 8 features
		return null;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductById(String id) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		
	}

}
