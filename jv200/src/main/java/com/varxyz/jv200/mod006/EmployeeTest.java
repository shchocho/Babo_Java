package com.varxyz.jv200.mod006;

//import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "유비";
		e.salary = 3200.00;
		e.birthDate = new MyDate(1,2,3);
		System.out.println(e.getDetails());
		System.out.println(e.birthDate);
		
		Manager m = new Manager();
		m.department = "영업부";
		m.name = "관우";
		m.salary = 3400.00;
		m.birthDate = new MyDate(2,3,4);
		System.out.println(m.getDetails());
		System.out.println(m.birthDate);
		
		

	}

}
