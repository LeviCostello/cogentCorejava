package com.cogent.productmanagement;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.exception.InvalidProductPriceException;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class main2 {

	public static void main(String[] args) throws InvalidProductPriceException {
		// TODO Auto-generated method stub
		ProductServiceImpl productService = new ProductServiceImpl();
		
		String result = null;
		try {
			result = productService.addProduct(new Product("Id", "name", 2000.0f, 100, null, null, "batchNo"));
		} catch (InvalidProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		if("success".equals(result)) { 
			System.out.println("product added successfully");
		}
	}

}
