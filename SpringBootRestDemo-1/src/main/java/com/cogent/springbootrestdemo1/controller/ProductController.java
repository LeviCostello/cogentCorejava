package com.cogent.springbootrestdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productserv;
	@GetMapping("/retreive")
	public List<Product> getStudentDetails(){
		return productserv.retreiveDetails();
	}
}
