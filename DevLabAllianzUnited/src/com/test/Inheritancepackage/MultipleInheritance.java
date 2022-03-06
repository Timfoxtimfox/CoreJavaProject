package com.test.Inheritancepackage;

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
	}
}

/*class X 
{
	void method1()
	{
		System.out.println("In X");
	}
}*/

class Y {
	
	void method1()
	{
		System.out.println("In Y");
	}
	
}

 //this is not possible as compiler gets confused which method1 will be called */

// Not possible 
/*class Z extends Y,X {
	
	
}*/