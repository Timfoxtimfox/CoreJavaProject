package com.test.packageMutipleInheritance;

public class Z implements A ,B {

@Override
	public void m1() {
		System.out.println("m1");

		
	}
	
	public static void main(String[] args) {
		
	Z z=new Z();
	z.m1();
	}
	  
}

interface A
{
	void m1();
}

interface B 
{
	void m1();
}
