package com.test.controlStatements;

public class TestTimLargest {
	
	public static void main(String[] args) {
		
		int a =1;
		int b =55;
		int c =100;
		
		TestTimLargest.printGreater(a,b,c);
	}
	
	static void printGreater(int a, int b, int c) {

		if (a > b) {      

		if(a > c) {

		System.out.println(a+" Is greater");

		}

		}

		else if (b > a){   

		if (b > c) {     

		System.out.println(b+" Is greater");

		}
		
		else {   
           System.out.println(c+" Is greater");

			}

		}

		else

		System.out.println(c+" Is greater");

		}
	
	

}
