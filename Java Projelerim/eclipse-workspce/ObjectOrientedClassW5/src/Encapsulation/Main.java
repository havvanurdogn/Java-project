package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Employee myEmployee1 = new Employee();
		myEmployee1.setEmployee_id(7456);
		myEmployee1.setEmployee_name("Horasan");
		myEmployee1.setEmployee_salary(2015.89);
		
		System.out.println("First Employee Id     : " + myEmployee1.getEmployee_id());
		System.out.println("First Employee Name   : " + myEmployee1.getEmployee_name());
		System.out.println("First Employee Salary : " + myEmployee1.getEmployee_salary());
		
		Employee myEmployee2 = new Employee();
		Employee myEmployee3 = new Employee();
		
		
		
		
	}

}
