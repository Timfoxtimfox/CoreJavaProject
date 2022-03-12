package com.test.LearnArrays;

public class ArraySum {
	public static void main(String[] args) {
		
		int[] numbers = {2,6,7,8,4,2,9,17};
		int length = numbers.length;
		int sum =0;
		
		for(int i =0;i<length;i++)
		{
			sum = sum+numbers[i];
			// 0 = 0+2  = 2 
			// 2 = 2+6  =8
			// 8 = 8+7 =15
			// 15 = 15+4 = 19
		}
		System.out.println("Sum of all elemts in array is " +sum);
		 
	}

}
