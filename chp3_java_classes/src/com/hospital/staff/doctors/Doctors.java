package com.hospital.staff.doctors;

public class Doctors extends com.hospital.staff.doctor.salary.Salary {
	
	// protected meth called from outside the package of extended child class 
	@Override
	protected double calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		return super.calculateSalary(amt, tax);
	}
	
	public static void main(String[] args) {
		Doctors doc = new Doctors();
		
		System.out.println(doc.calculateSalary(20000, 2000));
	}

}
