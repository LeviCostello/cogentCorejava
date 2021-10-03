package day3HW;

import java.util.Scanner;

public class Question4main {
	/*XYZ Technologies is in the process of increment the salary of the employees.  This increment is done based on their salary and their performance appraisal rating.
1.	If the appraisal rating is between 1 and 3, the increment is 10% of the salary.
2.	If the appraisal rating is between 3.1 and 4, the increment is  25% of the salary.
3.	If the appraisal rating is between 4.1 and 5, the increment is  30% of the salary.
Help them to do this,  by writing a program that displays the incremented salary. Write a class “IncrementCalculation.java” and write the main method in it.
Note   :   If either the salary is 0 or negative  (or) if the appraisal rating is not in the range 1 to 5 (inclusive), then the output should be “Invalid Input”.
Sample Input 1 :
•	Enter the salary
8000
•	Enter the Performance appraisal rating
3
Sample Output  1 :
8800
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the salary: ");
		int salary = scan.nextInt();
		System.out.print("enter the performance appraisal rating: ");
		double rating = scan.nextDouble();
		int value =(IncrementCalculation.calculation(salary, rating));
		if(value>0) {System.out.println(value);}
		else {System.out.println("Invalid Input");}
	}

}
