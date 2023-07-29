package com.company;

public class SumElements_Varargs {

	static int sum(int ...A)
	{
		int s=0;
		for(int i=0;i<A.length;i++)
		{
			s+=A[i];
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(sum(20,10,50));
		System.out.println(sum(20,10,50,100));

	}

}
