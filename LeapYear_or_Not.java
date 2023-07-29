package com.company;

import java.util.Scanner;

public class LeapYear_or_Not {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter a year");
	    year=sc.nextInt();
	    
	    if(year%4==0)
	    {
	    	 if(year%100==0)
	    	 {
	    		 if(year%400==0)
	    		 {
	    			 System.out.println("Its a leap year");
	    		 }
	    		 else
	    			 System.out.println("Its not a leap year");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Its a leap year");
	    	 }
	    }
	    else
	    {
	   	    System.out.println("Its not a leap year");
	    }
	}

}
