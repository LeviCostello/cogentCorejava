import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainDemo {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "abhi");
		Employee employee2 = new Employee(2, "abhi2");
		Employee employee3 = new Employee(3, "abhi3");
		Employee employee4 = new Employee(4, "abhi4");
		Employee employee5 = new Employee(5, "abhi5");

		List<Employee> employees = Arrays.asList(employee, employee2, 
				employee3, employee4, employee5);
		
		Employee employee6 = getEmployeeByName(employees, "abhi", 1);
		
		System.out.println(employee6);
	}
	
	public static Employee getEmployeeByName(List<Employee> employees, String name, int id) {
		//Optional : 
		return employees.stream()
				.filter(e->e.getName().equals(name) && id==e.getEmpNo())//predicate
				.findAny().orElse(null);
//		for (Employee employee : employees) {
//			if(Employee.getName().equals(name)) {
//				return employee;
//			}
//		}
//		return null;
	}
	public static List<String> getEmployeeNames(List<Employee> employees) {
		return employees.stream().map(Employee::getName).collect(Collectors.toList());
	}

}
