package com.company;

public class ReverseCopy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {10,9,8,7,6,5,4,3,2,1};
		int B[]= new int[10];
		
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		
		for(int x:B)
		{
			System.out.print(x+",");
		}

	}

}
