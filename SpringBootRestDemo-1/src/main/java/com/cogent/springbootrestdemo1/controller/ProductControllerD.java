package com.cogent.springbootrestdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cogent.springbootrestdemo1.model.Product;
import com.cogent.springbootrestdemo1.model.ProductRepository;
import com.cogent.springbootrestdemo1.service.ProductService;

@Controller
public class ProductControllerD {
	@Autowired
	ProductRepository productRepository;
	@GetMapping("/")
	public List<Product> getAllProduct(Model model)
	{
		List<Product> prdlist=productRepository.findAll();
		model.addAttribute("listdata",prdlist);
		return prdlist;
	}
	@GetMapping("/showForm")
	public String display(Model m)
	{
	Product p=new Product();
	m.addAttribute("prd",p);
	return "new_product";
		
	}
	//@PostMapping("/addDetails")
	@PostMapping("/saveProduct")
    public String saveProduct
    (@ModelAttribute("prd") Product prd) {
        // save employee to database
        productRepository.save(prd);
        //return "redirect:/";//It works like a forward
        // it will forward the request to request for /
        return "welcome";
    }


}