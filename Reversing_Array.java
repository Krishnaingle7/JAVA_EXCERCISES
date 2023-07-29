package com.company;

public class Reversing_Array {

	static int reverse(int n,int r)
	{
		int rev=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		return rev;
	}
	static int [] reverse(int A[])
	{
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
		}
		return B;
	}
	public static void main(String[] args) {
		System.out.println(reverse(234,0));
		
		int A[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<reverse(A).length;i++)
		{
			System.out.print(reverse(A)[i]);
		}
	}

}
