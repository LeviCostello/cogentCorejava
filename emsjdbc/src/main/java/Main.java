import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cogent.emsjdbc.service.EmployeeService;
import com.cogent.emsjdbc.service.EmployeeServiceImpl;
import com.cogent.emsjdbc.dto.Employee;

public class Main {
//empIdprivate,FirstName,empLastName,doj,dob,empSalary
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Variables
		Scanner scan = new Scanner(System.in);
		String result = null, id = null, empId = null, empFirstName = null, empLastName = null;
		String str = null;
		int output = 0;
		Date doj = null, dob = null;
		float empSalary = 0.0f;
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		///////////// guidelines for the program /////////////////
		Employee employee = new Employee("106","Levi","Costello",new Date(2021,9,2), new Date(1998,11,9),1234.0f);
		result=employeeService.addEmployee(employee);
		//Optional<List<Employee>> optional = employeeService.getEmployees();
		//Optional<List<Employee>> optional2 = employeeService.getEmployeeById(id);
//		if("success".equals(result)) {
//			System.out.println("employee added successfully");
//		} else {
//			System.out.println("error");
//		}
//		if(optional.isPresent()) {
//			System.out.println("Print the entire employee list");
//			optional.get().forEach(System.out::println);
//		}
//		if(optional2.isPresent()) {
//			System.out.println("Print the employee list by id");
//			optional2.get().forEach(System.out::println);
//		}
		
		
		do {
			System.out.println("What do you want to do?");
			System.out.println("1:Add Employee \n"
					+ "2:Delete Employee By Id\n"
					+ "3:Delete All Employees\n"
					+ "4:Display Employee By Id\n"
					+ "5:Display Employees()\n"
					+ "6:Update Employee\n"
					+ "7:Check Employee Existence\n"
					+ "8:Terminate\n");
			output = scan.nextInt();
			switch (output) {
			case 1:
//				System.out.println("Enter the Employee information");
//				System.out.println("empId: ");
//				empId = scan.next();
//				System.out.println("empFirstName: ");
//				empFirstName = scan.next();
//				System.out.println("empLastName: ");
//				empLastName = scan.next();
//				System.out.println("doj: ");
//				//options for scanning in the date
//				//-doj.parse(scan.next());
//				//-doj = new Date(strJ);
//				//-String s[] = strj.split("-"); then adding it into a parse
//				
////				str = scan.next();
////				String[] s = str.split("-");
////				doj = s;
//				
//				//("EEE MMM d HH:mm:ss zzz yyyy");
//				//("yyyy-MM-dd");
//				str = scan.next();
//				//parse is deprecated
//				doj.parse(str);
//				
//				System.out.println("dob: ");
//				str = scan.next();
//				dob.parse(str);
//				System.out.println("empSalary: ");
//				empSalary = scan.nextFloat();
//				//base example to add employee
				//new Employee("106","Levi","Costello",new Date(2021,9,2), new Date(1998,11,9),1234.0f)
				//result=employeeService.addEmployee(new Employee(empId, empFirstName, empLastName, doj, dob, empSalary));
				result=employeeService.addEmployee(new Employee("101","Levi","Costello",new Date(2021,9,2), new Date(1998,11,9),1234.0f));
				if("success".equals(result)) {
					System.out.println("employee added successfully");
				} else {
					System.out.println("error");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Enter id");
				id = scan.next();
				result = employeeService.deleteEmployeeById(id);
				if(result!=null) {
					System.out.println(result);
				}
				System.out.println();
				break;	
			case 3:
				employeeService.deleteAllEmployees();
				break;
			case 4:
				System.out.println("Enter id");
				id = scan.next();
				Optional<List<Employee>> optional2 = employeeService.getEmployeeById(id);
				if(optional2.isPresent()) {
					System.out.println("Print the employee list by id");
					optional2.get().forEach(System.out::println);
				}
				System.out.println();
				break;
			case 5:
				Optional<List<Employee>> optional = employeeService.getEmployees();
				if(optional.isPresent()) {
					System.out.println("Print the entire employee list");
					optional.get().forEach(System.out::println);
				}
				System.out.println();
				break;
			case 6:
				//result=employeeService.addEmployee(new Employee("106","Levi","Costello",new Date(2021,9,2), new Date(1998,11,9),1234.0f));
				result=employeeService.updateEmployee(new Employee("101","Zith","Durvail",new Date(2169,4,20), new Date(1370,12,25),420.0f));
				if(result!=null) {
					System.out.println(result);
				}
				System.out.println();
				break;
			case 7:
				
				break;
			case 8:
				System.out.println("Terminated!");
				
				break;

			default: 
				System.out.println("Invalid Output");
				break;
			}
		} while (output!=8);
		scan.close();
	}

}
