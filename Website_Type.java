package com.company;

import java.util.Scanner;

public class Website_Type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter domain name");
		String domain = sc.nextLine();
		
		String ext=domain.substring(domain.lastIndexOf(".")+1);
		switch(ext)
		{
		case "com":System.out.println("commercial");
		break;
		case "org":System.out.println("Organisational");
		break;
		case "net":System.out.println("Network");
		break;
		case "gov":System.out.println("Government");
		break;
		}

	}

}
