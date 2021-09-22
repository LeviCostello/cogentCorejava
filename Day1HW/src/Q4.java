import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		//check which department has the highest placement
		//variables
		int CSE = 0;
		int ECE = 0;
		int MECH = 0;
		int check = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		//Scan the placement score
		System.out.print("Enter CSE score: ");
		CSE = scan.nextInt();
		System.out.print("Enter ECE score: ");
		ECE = scan.nextInt();
		System.out.print("Enter MECH score: ");
		MECH = scan.nextInt();
		//calculation comparison
		if(check < CSE) {
			check = CSE;
		}
		if(check < ECE){
			check = ECE;
		}
		if(check < MECH) {
			check = MECH;
		}
		System.out.println(check);
		System.out.println("Highest Placement: ");
		if(CSE == 0 && ECE == 0 && MECH == 0) {
			System.out.print("Non of the department has got the highest placement");
		}else {
			if(check == CSE) {
				System.out.print("CSE");
			}else if(check == ECE) {
				System.out.print("ECE");
			}else if(check == MECH){
				System.out.print("MECH");
			}
		}
	}
}
