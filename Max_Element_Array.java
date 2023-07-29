package com.company;

public class Max_Element_Array {

	static int Max(int A[])
	{
		int Max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>Max)
			{
				Max=A[i];
			}
		}
		return Max;
	}
	public static void main(String[] args) {
		
		System.out.println(Max(new int[]{56,98,100,1000,78}));

	}
}

