package com.test.Inheritancepackage;

public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		C c = new C();
		c.methodA();
		c.methodB();
		c.methodC();
	}

}

class A 
{
	void methodA()
	{
		System.out.println("Inside A ");
	}
}

class B extends A 
{
	void methodB()
	{
		System.out.println("Inside B ");
	}
}

class C extends B
{
	void methodC()
	{
		System.out.println("Inside C ");
	}
}
