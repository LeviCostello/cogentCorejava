import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A-Z is connected from 65-91
		//i felt like using a hashmap
		//variables
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int i = 0;
		String UL = null;
		int[] arr = {0,1,2,3};
		boolean check = true;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//always 4 digits
		//this is a  ascii problem
		//set up both the array for the 4 digits and the map for the magic board
		for(i = 0; i < 4; i ++) {
			check = true;
			//make sure numbers scanned are between 65-91 and 97-122
			System.out.println("Upper Case or Lower Case:(u/l)");
			UL = scan.next();
			if(UL.equals("u")) {
				System.out.println("Enter 4 digets from 65-90(UpperCase)");
				arr[i] = scan.nextInt();
				while(check) {
					if(arr[i] < 65  || arr[i] > 90) {
						System.out.println("Please use a diget between 65-91!");
						arr[i] = scan.nextInt();
					}else {
						check = false;
					}
				}
			}else if(UL.equals("l")) {
				System.out.println("Enter 4 digets from 97-122(LowerCase)");
				arr[i] = scan.nextInt();
				while(check) {
					if(arr[i] < 97  || arr[i] > 122) {
						System.out.println("Please use a diget between 97-122!");
						arr[i] = scan.nextInt();
					}else {
						check = false;
					}
				}
			}else {
				System.out.println("Please put either \"u\" or \"l\"");
				i--;
			}
			
		}
		i = 'A';
		for(char ch = 'A'; ch <= 'z'; ch++) {
			if(ch <= 'Z' || ch >= 'a') {
				map.put(i, String.valueOf(ch));
			}
			if(ch == '`') {
				i =96;
			}
			i++;
		}
		
		//compare the scan to the map
		for(i = 0; i < 4; i++) {
			for(int j : map.keySet()) {
				if(j == arr[i]) {
					System.out.println(j + "-" + map.get(j));
					break;
				}
			}
		}
	}

}
