package com.test.polymorphismPackage;

public class Testclass {
	public static void main(String[] args) {
		
		SalaryExpectations salaryExpectations = new Mohan();
		
	
		salaryExpectations.salary();
		salaryExpectations = new Orlando();
		salaryExpectations.salary();
		salaryExpectations = new Tim();
		salaryExpectations.salary();
		salaryExpectations = new SS();
		salaryExpectations.salary();
		
	}
}
	
	class SalaryExpectations 
	{
		void salary(){
			
		}
	}
	class Mohan extends SalaryExpectations 
	{
		void salary()
		{
			System.out.println("Mohan is taking 8758658671234556");
		}
	}
	
	class SS extends SalaryExpectations 
	{
		void salary()
		{
			System.out.println("SS is taking 8758658671234556");
		}
	}
	
	class Tim extends SalaryExpectations 
	{
		void salary()
		{
			System.out.println("Tim is taking 99999999999999 dollars");
		}
	}
	
	class Orlando extends SalaryExpectations 
	{
		void salary()
		{
			System.out.println("Orandlo is taking 99999999999999 dollars");
		}
	}


