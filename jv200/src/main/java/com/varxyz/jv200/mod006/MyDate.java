package com.varxyz.jv200.mod006;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day =day;
		this.month = month;
		this.year = year;
	}
	
	public int day() {
		return this.day;
	}
	public int month() {
		return this.month;
	}
	public int year() {
		return this.year;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof MyDate) {
//			if(this.day() == ((MyDate)o).day()) {
//				if(this.month() == ((MyDate)o).month()) {
//					if(this.year() == ((MyDate)o).year()) {
//						return true;
//					}
//				}
//			}				
			
			MyDate d = (MyDate) o;
			if(d.day == day && d.month == month && d.year == year) {
				return true;
			} 
		}
				
		return false;
	}
	
	
	

}
