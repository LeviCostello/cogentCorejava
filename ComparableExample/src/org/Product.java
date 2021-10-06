package org;

public class Product implements Comparable<Product>{
	public int prodId;
	public String name;
	public float price;
	public Product(int prodId, String name, float price) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
	}
	public int compareTo(Product prod){  
		if(price==prod.price)  
			return 0;  
		else if(price>prod.price)  
			return 1;  
		else  
			return -1;
		} 
}
