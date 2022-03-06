package com.test.PackageI;


/* This class states what is method overloading/compile time Polymorphism 
1) using different arguments 
2) different data type (example stated below) */

public class TestMethodOverloading {
	
	public static void main(String[] args) {
		System.out.println("Int value is" +TestLogic.method11(40, 20) +
				"String value is" +TestLogic.method11("Mohan", "Tim"));
		}

}
class TestLogic{
	
	static int method11(int a , int b) {
		return a+b;
	}
	
	static String method11(String a , String b) {
		return a+b;
	}
	
}
