package day3HW;

public class IncrementCalculation {

	public IncrementCalculation() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calculation(int salary, double rating) {
		// TODO Auto-generated method stub
		if(salary<=0) {return -1;}
		if(rating>=1 && rating <=3) {
			salary = (int) (salary + (salary *.1));
			return  salary;
		}else if(rating>=3.1 && rating <=4) {
			salary = (int) (salary + (salary *.25));
			return salary;
		}else if((rating>=4.1 && rating <=5)) {
			salary = (int) (salary + (salary *.3));
			return salary;
		}
		return -1;
	}
}
