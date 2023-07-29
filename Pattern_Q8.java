package com.company;

public class Pattern_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.format("%02d  ",count);
				count++;
			}
			System.out.println("");
		}

	}

}
