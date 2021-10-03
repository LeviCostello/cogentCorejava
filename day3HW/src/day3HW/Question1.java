package day3HW;

import java.util.Scanner;

public class Question1 {
	/*Rhea Pandey’s teacher has asked her to prepare well for the lesson on seasons. 
	 * When her teacher tells a month, she needs to say the season corresponding 
	 * to that month. Write a program to solve the above task.
•	Spring – March to May,
•	Summer – June to August,
•	Autumn – September to November and,
•	Winter – December to February.
Month should be in the range 1 to 12.  If not the output should be “Invalid month”.

Sample Input 1:
•	Enter the month:11
Sample Output 1:
•	Season:Autumn
*/

	public static void main(String[] args) {
		// variables
		int season = 0;

		//Set up a scanner and get a int variable from user (make sure its a int)
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter a Season: ");
			season = scan.nextInt();
			while (season < 0 || season > 13) {
				System.out.println("Please Enter a valid Entry");
				season = scan.nextInt();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Input");
		}
		
		if(season >= 3 && season <= 5){
			System.out.println("Season: Spring");
		}else if(season >= 6 && season <= 8){
			System.out.println("Season: Summer");
		}else if(season >= 9 && season <= 11){
			System.out.println("Season: Autumn");
		}else if(season <= 2 && season == 12){
			System.out.println("Season: Winter");
		}
		
	}

}
