package day3HW;

import java.util.Scanner;

public class Question2 {
	/*To speed up his composition of generating unpredictable rhythms, Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help him out?
Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).

•	Input 1 should be lesser than Input 2. Both the inputs should be positive. 
•	Range must always be greater than zero.
•	If any of the condition mentioned above fails, then display “Provide valid input”
•	Use a minimum of one for loop and one while loop

Sample Input 1:
2
15
Sample Output 1:
2 3 5 7 11 13
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a small positive number range(greater than 2): ");
		int a = scan.nextInt();
		System.out.print("and big positive number: ");
		int b = scan.nextInt();
		
		if(a<2) {
			System.out.println("Please Enter Valid Input");
		}else if(a < 0 || b < 0) {
			System.out.println("Please Enter Valid Input");
		} else if((a - b) == 0 || a > b) {
			System.out.println("Pl2ease enter a valid range");
		}else {
			for (int i = a; i < b; i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}
	
	static boolean isPrime(int n) {
		if(n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
		return true;
	}

}
