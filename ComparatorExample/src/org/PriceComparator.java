package org;

import java.util.Comparator;

public class PriceComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Product p1 = (Product) obj1;
		Product p2 = (Product) obj2;
		if (p1.price == p2.price)
			return 0;
		else if (p1.price > p2.price)
			return 1;
		else
			return -1;
	}

}
