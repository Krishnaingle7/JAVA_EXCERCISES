package com.company;

public class Pattern_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		//for(int i=1;i<=5;i++)
		//{
		//	for(int j=1;j<=5;j++)
		//	{
		//    	System.out.print(count+" ");
		//		count++;
		//	}
		//	System.out.println("");
	    // }
		
		//For Filling the gaps / balancing
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.format("%02d ",count);
				count++;
			}
			System.out.println("");
		}

	}

}
