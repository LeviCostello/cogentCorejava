package com.cogent.springbootrestdemo1.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;

@RestController
public class ProductResource {

	@Autowired
	private ProductRepository prodRep;
	
	//MySQL Methods
	
	//http:localhost:8080/product
	public void insertProduct(Product p) {
		prodRep.save(p);
	}
	public void updateData(int prodId) {
		Optional<Product> p = prodRep.findById(prodId);
		if(p.isPresent()) {
			Product p1 = p.get();
			p1.setProduct_name("Big Chungus");
			p1.setPrice(420.69);
			prodRep.save(p1);
		}
	}
	
	public void findAllData() {
		List<Product> prodList = prodRep.findAll();
	}
	
	//PostMan Methods
	@GetMapping("/product/{id}") //@GetMapping("/studentname/{name}")
	public ResponseEntity<Product> retrieveProduct(@PathVariable int id) 
	throws ResourceNotFoundException{
		Product p1 = prodRep.findById(id)
			.orElseThrow(() -> 
			new ResourceNotFoundException("Student not found for this id :: " + id));
		return ResponseEntity.ok().body(p1);
	}
	
	@DeleteMapping("/product/{id}")
	private void deleteStudent(@PathVariable int id) {
		prodRep.deleteById(id);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Object>
	createStudent(@RequestBody Product prod) {
		Product savedProd = prodRep.save(prod);
		URI	location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedProd.getProduct_code()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product prod, @PathVariable int id)
	throws ResourceNotFoundException{
		Product prod1 = prodRep.findById(id)
			.orElseThrow(() -> 
			new ResourceNotFoundException("Student Not Found for this id:: " + id));
		prod1.setProduct_code(id);
		prod1.setProduct_name(prod.getProduct_name());
		Product prodUpdate = prodRep.save(prod);
		
		return ResponseEntity.ok(prodUpdate);
	}
	
}
