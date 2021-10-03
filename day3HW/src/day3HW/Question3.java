package day3HW;

import java.util.Scanner;

public class Question3 {
	/*Goutam and  Tanul plays  by  telling numbers.  
	 * Goutam says a number to Tanul.  Tanul should first reverse the 
	 * number and check if it is same as the original.  If yes,  Tanul 
	 * should say “Palindrome”.  If not, he should say “Not a Palindrome”.  
	 * If the number is negative, print “Invalid Input”.  Help Tanul 
	 * by writing a program.
	 * 
	 * 
	 * Sample Input 1 :
21212
Sample Output 1 :
Palindrome
Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String palindrome = scan.next();
		int x = 0;
		int y = palindrome.length()-1;
		for(int i = 0; i < y; i++){
			try {
				if(palindrome.charAt(x) == palindrome.charAt(y)) {
					System.out.println(palindrome.charAt(x));
					x++;
					System.out.println(palindrome.charAt(y));
					y--;
				}else {
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("string error");
				e.printStackTrace();
			}
		}
		if(x >= y && y <= x) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a Palindrome");
		}
		

	}

}
