package com.test.controlStatements;


/* check if else condition in java  */
public class TestCondition {
	
	public static void main(String[] args) {
		
		int totalMarks = 100;
		int eligibleCriteria = 50;
		int student1Marks = 40;
		
		
		// Business for Application
		// What condition we want the program to put 
		// if marks are greater than or equal to 50 : Pass the student 
		// else tell him to reappear again 
		  TestCondition.checkResult(student1Marks,eligibleCriteria);
		
	}
	
	
	static void checkResult(int student1Marks, int eligibleCriteria)
	{
		if(student1Marks>=eligibleCriteria)   // condition // if true //else  40>=50
		{
			System.out.println("You have passed the exam"); // Print this 
		}
		else
		{
			System.out.println("You have failed the exam ,Please reappear after a month"); //print this
		}
		
	}

}
