package com.company;

import java.util.Scanner;

public class Radix {

	public static void main(String[] args) {
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextLine();
		
		if(num.matches("[01]+"))
		{
			System.out.println("Binary radix =2");
		}
		else if(num.matches("[0-7]+"))
		{
			System.out.println("Octal radix =8");
		}
		else if(num.matches("[0-9]+"))
		{
			System.out.println("Decimal radix =10");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println("HexaDecimal radix =16");
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
