package com.company;

public class Increasing_Size_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5};
		int B[]=new int[10];
		
		System.out.println("length of A = "+A.length);
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		A=B;
		
		System.out.println("length of A = "+A.length);

	}

}
