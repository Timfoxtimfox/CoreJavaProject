package com.test.LearnArrays;

import java.util.Arrays;

public class PrintArray {
	
	public static void main(String[] args) {
		
		int[] noOfGoals ={10,20,15,5,6,7};
		
		Arrays.sort(noOfGoals);
		System.out.println("length of array is" +noOfGoals.length);
		
		for(int i=0;i<noOfGoals.length;i++)
		{
			System.out.println(noOfGoals[i]);
		}
		
		}

}
