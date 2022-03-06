package com.test.accessModifierPackage;

public class LearnAccessModifiers {
	
	public static void main(String[] args) {
		
		Mac mac = new Mac();
		// we can access a because a is protected and scope is within package 
		int x=mac.a;
		System.out.println("protected value is " +x);
		// we cannot access this as the scope is private and is not visible 
		 //mac.b;
		// we can access this as scope is public and its accessible anywhere
		int z=mac.c;
		System.out.println("public value is " +z);
		
		// cant use becoz method is coming from another class and is priavte 
		 //mac.mymethod();
		
		
	}

}

class Mac{
	
protected int a =10;
private int b =10;
public int c =10;

private void mymethod()
{
	System.out.println("This is private method");
}
}
