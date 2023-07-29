package com.company;

public class Adding_2_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{4,5,2},{8,7,9},{3,4,9}};
		int C[][]= new int[3][3];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]= A[i][j]+B[i][j];
			}
		}
		for(int x[]:C)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
