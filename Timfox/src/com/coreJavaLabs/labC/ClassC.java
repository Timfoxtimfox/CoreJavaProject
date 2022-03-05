package com.coreJavaLabs.labC;
/*Lab exercise 3: 
Program 3 :
Calculate Quotient and Remainder of two numbers and print the values 
*/
public class ClassC {
	public static void main (String args[]) {
		int a= 4;
		int b= 3;
		ClassC classC = new ClassC();
		classC.calculateQuotient(a,b);
		classC.calculateRemainder(a, b);
	}
	
	public void calculateQuotient(int a, int b)
	{
		float c= a/b;
		System.out.println("The quotient of "+ a +" and " +b+ " is "+c);
	}
	public void calculateRemainder(int a, int b)
	{
		int c= a%b;
		System.out.println("The remainder of "+a+" and "+b+" is "+c);
	}
}