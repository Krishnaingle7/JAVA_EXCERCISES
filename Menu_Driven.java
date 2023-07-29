package com.company;

import java.util.Scanner;

public class Menu_Driven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("Enter two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter OPTION IN WORDS");
		String option=sc.nextLine();
		option.toUpperCase();
		
		switch(option)
		{
		case "ADD":System.out.println("Sum is "+(x+y));
		break;
		case "SUB":System.out.println("Sub is "+(x-y));
		break;
		case "MUL":System.out.println("Mul is "+(x*y));
		break;
		case "DIV":System.out.println("Div is "+(x/y));
		break;
		default:System.out.println("invalid option");
		break;
		}

	}

}
