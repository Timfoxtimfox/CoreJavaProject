package com.test.packageB;

public class LearnParameterisedMethod {
	
	
	LearnParameterisedMethod()
	{
		System.out.println("This is constructor and will be called before methods are being called ");
	}
	
	
	public static void main(String args[])
	{
		int x = 10;
		int y = 20; 
		LearnParameterisedMethod learnParameterisedMethod = new LearnParameterisedMethod();
		learnParameterisedMethod.Addition(x,y);
		learnParameterisedMethod.subratction(x,y);
		}
	
	public void Addition(int x , int y)
	{
		int c = x+y;
		System.out.println("Addition of two numbers is " +c);
	}
	
	public void subratction(int x , int y)
	{
		int c = x-y;
		System.out.println("Addition of two numbers is " +c);
	}
	
	
	
	

}
