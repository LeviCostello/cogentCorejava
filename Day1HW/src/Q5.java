import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//variables
		double cost = 0;
		double refreshment = 50;
		double coupon = 0.02;
		double discount = 0.10;
		double tCheck = 0;
		String rCheck = null;
		String coCheck = null;
		String ciCheck = null;
		Boolean check = true;
		//scanning the tickets,refreshments,coupon, and circle
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(check) {
			System.out.print("Enter the No. of tickets(5-40): ");
			tCheck = scan.nextInt();
			if(tCheck <5 || tCheck > 40) {
				System.out.println("Incorrect Input");
			}else {
				check = false;
			}
		}
		System.out.print("Do you want refreshments(y/n): ");
		rCheck = scan.next();
		System.out.print("Enter the No. of tickets(y/n): ");
		coCheck = scan.next();
		check = true;
		System.out.print("Enter the circle(k/q): ");
		ciCheck = scan.next();
		while(check) {
			if("k".equals(ciCheck) || "q".equals(ciCheck)) {
				check = false;
			}else {
				
				System.out.println("Incorrect Input");
				System.out.print("Enter the circle(k/q): ");
				ciCheck = scan.next();
			}
		}
		//calculate and display
		cost = tCheck;
		System.out.println(cost);
		if(ciCheck.equals("k")) {
			cost = cost * 75;
			System.out.println(cost);
			if(coCheck.equals("y")) {
				cost -= cost * coupon;
			}
			System.out.println(cost);
			if(tCheck > 20) {
				cost -= cost * discount;
			}
			System.out.println(cost);
			if(rCheck.equals("y")) {
				cost += tCheck * refreshment;
			}
		}else if(ciCheck.equals("q")){
			cost = cost * 150;
			System.out.println(cost);
			if(coCheck.equals("y")) {
				cost -= cost * coupon;
			}
			System.out.println(cost);
			if(tCheck > 20) {
				cost -= cost * discount;
			}
			System.out.println(cost);
			if(rCheck.equals("y")) {
				cost += tCheck * refreshment;
			}
		}		
		System.out.printf("Ticket Cost: %.2f", cost);
	}
}
