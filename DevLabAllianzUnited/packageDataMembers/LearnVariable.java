package com.test.packageDataMembers;


/* in this class we will learn
 *  how to create different variables in java 
 *  how to create object using new
 *  how to create static variables and call them with class Name
 */
public class LearnVariable {
	
	public LearnVariable() {
		// TODO Auto-generated constructor stub
	}
	
	 //Creation of Instance Variable
	   int x=60;
	 //Creation of static Variable
	  static int c =50;
		
	public static void main(String args[])
	{
		int x;  //Declaration of local Variable 
		x=100;   //Initializing of Value 
		int y=20;
		int z = x+y; 
		
		//How to create object in a class.
		LearnVariable testExample =new LearnVariable();
		
		testExample.printA(x,y);
		
		// call static variable 
		System.out.println("Static variable is " +LearnVariable.c);
		System.out.println("Local variable is " +z);
		System.out.println("Instance variable is " +x);
		
		}
	
	// how to create a method which doesnt return anything
	public void printA(int v, int x)
	{
		System.out.println("Akshit is Great "); 
	    System.out.println("Russia invades Ukraine ");
		
	}
	
	
	
}

/*Shortcuts used 
 * write sout and the press ctrl + Space*/
