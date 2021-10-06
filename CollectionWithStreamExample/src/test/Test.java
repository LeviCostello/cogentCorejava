package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.Product;

public class Test {

	public static void main(String[] args) {
		List<Product> prodList=new ArrayList<Product>();
		prodList.add(new Product(1001,"TV",95000,1,"Apple",0));
		prodList.add(new Product(1002,"Tripod",7000,2,"Digitech",100));
		prodList.add(new Product(1003,"CCTV Camera",4500,5,"Mi",150));
		prodList.add(new Product(1004,"Mobile",50000,1,"Samsung",0));
		prodList.add(new Product(1005,"Monitor",16000,4,"Dell",100));
		prodList.add(new Product(1006,"Mouse",1200,15,"logitech",50));
		//find out product with free delivery
		List<String> freeDeliveryProducts=prodList.stream()
				.filter(p->p.deliveryCharges==0.0f)//filterdata
				.map(p->p.name)//fetch names from the filter data
				.collect(Collectors.toList());
		System.out.print(freeDeliveryProducts);
	}

}
