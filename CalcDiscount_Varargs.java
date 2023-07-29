package com.company;

public class CalcDiscount_Varargs {

	static double discount(double ...Price)
	{
		double sum=0;
		for(int i=0;i<Price.length;i++)
		{
			sum+=Price[i];
			
			if(sum<500)
			{
				return sum*0.10;
			}
			else if(sum>=500 && sum<1000)
			{
				return sum*0.15;
			}
			else 
			{
				return sum*0.20;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(discount(200,50));
		System.out.println(discount(200,300,400,500));

	}

}
