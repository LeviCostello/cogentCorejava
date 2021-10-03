package day3HW;

import java.util.Scanner;

public class Question5 {
	/*Chaman planned to choose a four digit lucky number for his car. 
	 * His lucky numbers are 3,5 and 7. Help him find the number, 
	 * whose sum is divisible by  3 or 5 or 7. Provide a valid car number, 
	 * Fails to provide a valid input then display that number is not a 
	 * valid car number. 
Note : The input other than 4 digit positive number[includes negative and 0] 
is considered as invalid.

Refer the samples, to read and display the data.
Sample Input 1:
•	Enter the car no:1234
Sample Output 1:
•	Lucky Number
Sample Input 2:
•	Enter the car no:1214
Sample Output 2:
•	Sorry its not my lucky number
Sample Input 3:
•	Enter the car no:14
Sample Output 3:
•	14 is not a valid car number
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the car no:");
		int carNo = scan.nextInt();
		if(carNo > 9999 || carNo < 1000) {
			System.out.println(carNo + " is not a valid Input");
		}else {
			while(carNo > 0) {
				int num = carNo % 10;
				count += num;
				//System.out.println(num);
				carNo = carNo / 10;
			}
		}
		if(count % 3 == 0) {
			System.out.println("Lucky Number");
		}else if(count % 5 == 0) {
			System.out.println("Lucky Number");
		}else if(count % 7 == 0) {
			System.out.println("Lucky Number");
		}else {
			System.out.println("Sorry, its not a lucky number");
		}
	}

}
