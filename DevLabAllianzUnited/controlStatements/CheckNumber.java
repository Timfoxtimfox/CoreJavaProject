package com.test.controlStatements;

public class CheckNumber {
	
	public static void main(String[] args) {
		
		int value = -20;
		CheckNumber.checkValueType(value);
		}
	
	static void checkValueType(int value)
	{
		if(value>0)  
		{
			System.out.println("The Number is Positive " +value);
		}
		else if(value<=0)  
		{
			System.out.println("The Number is Negative " +value);
		}
		else
		{
			System.out.println("The Number is Zero " +value);
		}
		
		
	}

}
