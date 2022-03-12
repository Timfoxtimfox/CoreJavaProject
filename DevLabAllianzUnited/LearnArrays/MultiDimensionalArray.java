package com.test.LearnArrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		int a[][] ={{7,7,7},{8,8,8},{1,2,3}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+ "  ");
			}                                    
			 System.out.println();
		}
		   
	}

}
