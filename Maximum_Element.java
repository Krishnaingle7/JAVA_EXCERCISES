package com.company;

public class Maximum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5,6,7,8,9,10};
		int Max=A[0];
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>Max)
			{
				Max=A[i];
			}
		}
		System.out.println(Max);

	}

}
