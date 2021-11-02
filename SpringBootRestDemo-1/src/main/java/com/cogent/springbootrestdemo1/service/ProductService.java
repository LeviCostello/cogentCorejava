package com.cogent.springbootrestdemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrep;
	public List<Product> retreiveDetails() {
		return productrep.findAll();
	}
}
