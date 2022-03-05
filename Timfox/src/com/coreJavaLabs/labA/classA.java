package com.coreJavaLabs.labA;

public class classA {
	public static void main(String args[])
	{
		int l= 10;
		int w= 20;
		classA classA = new classA();
		classA.perimeter(l,w);
		classA.area(l, w);
	}
	
	public void perimeter(int l, int w)
	{
		int c= l+w;
		System.out.println("A rectangle has a perimeter of " +2*c);
	}
	public void area(int l, int w)
	{
		int c= l*w;
		System.out.println("Area of a rectangle is " +c);
	}
}
/*Lab Exercise Steps :
Program 1 : 
Create a Package 
Create a class 
Method 1 :
Calculate the perimeter of a rectangle 
Formaula : 2(l+w)
Method 2 : 
Calculate the Area of a rectangle 
Formaula : l*w
Main => create 2 variables l and w 
Create public void culculatePerimter(int l , int w)
Print the value to console */