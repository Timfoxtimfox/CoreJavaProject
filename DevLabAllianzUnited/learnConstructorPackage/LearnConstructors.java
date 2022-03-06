package com.test.learnConstructorPackage;

public class LearnConstructors {
	

	LearnConstructors()
	{
		System.out.println("This is default Constructor");
	}
	
	LearnConstructors(int x , int y)
	{
		int z = x+y;
		System.out.println("This is parametreised Constructor" +z);
	}
	
	
	public static void main(String[] args) {
		
		int x = 10;
		int y =20;
		LearnConstructors learnConstructors = new LearnConstructors(x,y);
		
	}
	

	

}
