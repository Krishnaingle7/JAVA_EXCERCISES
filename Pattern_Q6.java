package com.company;

public class Pattern_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.format(count+" ");
				count++;
			}
			System.out.println("");
		}
	}

}
