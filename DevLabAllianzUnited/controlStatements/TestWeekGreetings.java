package com.test.controlStatements;

import java.util.Scanner;

public class TestWeekGreetings {
	
	public static void main(String[] args) {
		
		// how to Take input from User 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Day name for Greetings ");
		String day = sc.nextLine();
		TestWeekGreetings.greetings(day);
	}
	
	 static void greetings(String day)
	 {
		 switch(day)
		 {
		 case "Monday":
		 System.out.println("Salary credit is only good thing about Monday ");
		 break;
		 case "Tuesday":
			 System.out.println("Tuesdays is a sad day ");
			 break;
		 case "Wednesday":
			 System.out.println("Welcome to middleof week..workHard ");
			 break;
		 case "Thrusday":
			 System.out.println("Weekend Approaching , Stay calm ");
			 break;
		 case "Friday":
			 System.out.println("Lets plan for party ");
			 break;
		 case "Saturday":
			 System.out.println("Beers and cheers");
			 break;
			 default :
				 System.out.println("SUNDAYYYYYYYYYYYYY");
		 
		 }
		 
	 }

}
