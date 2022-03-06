package com.test.Inheritancepackage;

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method2();
		child.method1();
		System.out.println("value of parent variable is " +child.a);
		System.out.println("value of child variable is " +child.b);
		
	}

}

 class Parent{
	 
	 int a =10;
	
void method1()
{
	System.out.println("Parent class Method");
}
	
}
 class Child extends Parent
 {
	 int b =20;
	 void method2()
	 {
	 	System.out.println("Child class Method");
	 }
 }

