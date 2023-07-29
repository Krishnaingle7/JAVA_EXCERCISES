package com.company;

import java.util.Scanner;

public class Day_num {

	public static void main(String[] args) {
	     int day;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a day number");
	     day=sc.nextInt();
	     
	     switch(day)
	     {
	     case 1:System.out.println("Mon");
	     break;
	     case 2:System.out.println("tue");
	     break;
	     case 3:System.out.println("wed");
	     break;
	     case 4:System.out.println("thu");
	     break;
	     case 5:System.out.println("fri");
	     break;
	     case 6:System.out.println("sat");
	     break;
	     case 7:System.out.println("sun");
	     break;
	     default:System.out.println("Invalid");
	     break;
	     }

	}

}
