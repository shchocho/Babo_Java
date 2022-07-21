package com.varxyz.jv200.mod006;



public class Employee {
	protected String name;
	protected double salary;
	protected MyDate birthDate;		
	
	public String getDetails() {
		return "Name: " + name + "\nSalary: "+ salary;
	}

	public void setName(String name) {
		this.name = name;		
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setBirthDate(MyDate myDate) {
		this.birthDate = myDate;		
	}
	
	@Override
	public boolean equals(Object o) {
		o = (Employee) o;
		if(this.name == ((Employee)o).name) {				
			if(this.birthDate.day() == ((Employee)o).birthDate.day()) {
				if(this.birthDate.month() == ((Employee)o).birthDate.month()) {
					if(this.birthDate.year() == ((Employee)o).birthDate.year()) {
						return true;
					}
				}
			}			
		}
		return false;
	}
	
}
