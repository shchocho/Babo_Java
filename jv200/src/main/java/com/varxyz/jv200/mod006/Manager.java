package com.varxyz.jv200.mod006;

public class Manager extends Employee {
	protected String department;
	
	public String getDetails() {
		//오버라이딩
		return super.getDetails() + "\nDepartment: " + department;
	}
}
