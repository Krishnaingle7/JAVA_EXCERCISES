package com.company;

public class Sum_CommandlineArgs {

	public static void main(String[] args) {
		double sum=0;
		for(String x:args)
		{
			sum=sum+Double.parseDouble(x);
		}
		System.out.println("sum is "+sum);

	}

}
