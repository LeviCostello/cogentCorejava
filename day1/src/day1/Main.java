package day1;

public class Main {

	public static void main(String[] args) {
		/*Question 1*/
		//leap year: %4 or 100 and 400
		//leap year will hit every 400 year
		//it has to be every century from 1-99
		/*Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println("Current year "+year+" is a leap year.");
		}else{
			System.out.println("Current year "+year+" is not a leap year.");
		}*/
////////////////////////////////////////////////////////////////////////
		/*Question 2*/
		//strong number:
		//145 = 1! + 4! + 5!
		//145 = 1 + 24 + 120
		//hits: separate digit / calc the factorial / sum it / compare it to original
		/*Scanner scan = new Scanner(System.in);
		int sNum = scan.nextInt();
		int factorial = 1;
		int j = 0;
		int z = 0;
		System.out.println("Input Strong Number = " + sNum);
		System.out.println("Factorials: ");
		while(sNum > 0) {
			int var = sNum %10;
			sNum /= 10;
			System.out.print(var + ", ");
			for(j = 1; j <= var; j++) {factorial *= j;}
			z += factorial;
			factorial = 1;
		}
		System.out.println();
		System.out.println("Calc. Strong Number = " + z);*/
//////////////////////////////////////////////////////////////////////
		/*Question 3*/
		//armstrong:
		//153: 1 + 125 +27
		//cubed each character
		/*Scanner scan = new Scanner(System.in);
		int aNum = scan.nextInt();
		int square = 0;
		int i = 0;
		System.out.println("Armstrong Number: " + aNum);
		System.out.print("vals: ");
		while(aNum > 0) {
			double var = aNum % 10;
			aNum /= 10;
			var = Math.pow(var, 3);
			System.out.print(var + ",");
			i += var;
		}
		System.out.println();
		System.out.println("Output: " + i);*/
//////////////////////////////////////////////////////////////////////
		/*Question 4*/
		//perfect number:
		//the number and the number's factors are equal 
		//to the number when added
		/*int num = 6;
		int check = num;
		int sum = 0;
		int i = 0;
		while(i <= num/2) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum == num) {
			System.out.println("Not Perfect");
		}
		System.out.println("Perfect");
		System.out.println(sum);
		System.out.println(num);*/
///////////////////////////////////////////////////////////////////////
		/*Question 5*/
		//from 1 to 100 which are divisible by 2 & 7
		for(int i = 0; i <= 100; i++) {
			if(i % 14 == 0) {
				System.out.println(i + " is divisible by 2 & 7");
			}
		}
	}
}
