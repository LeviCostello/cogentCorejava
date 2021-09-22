import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculate the fuel consumption of your truck
		//variables
		boolean check = true;
		double liters = 0;
		double distance = 0;
		//scanner and checks for negatives
		while(check) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter amount of Liters: ");
			liters = scan.nextInt();
			System.out.println("Enter number of KM: ");
			distance = scan.nextInt();
			if(liters <= 0 || distance <= 0) {
				System.out.println("Enter a non negative/0 number");
			}else {
				check = false;
			}
		}
		
		//check for negatives
		double result = 0;
		result = (liters/distance) * 100;
		System.out.printf("KM distance before stop: %.2f",result);
		//calculate G
		result = (distance*0.6214)/(liters*0.2642);
		System.out.println();
		System.out.printf("G distance before stop: %.2f",result);
		//calculate KM
		
	}
}
