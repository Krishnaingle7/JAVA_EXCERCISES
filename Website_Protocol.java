package com.company;

import java.util.Scanner;

public class Website_Protocol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a URL");
		String url=sc.nextLine();
		
		String protocol=url.substring(0,url.indexOf(":"));
		
		if(protocol.equals("http"))
		{
			System.out.println("Hyper text transfer protocol");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File transfer protocol");
		}
		
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		if(ext.equals("com"))
		{
			System.out.println("Commercial");
		}
		else if(ext.equals("org"))
		{
			System.out.println("organisation");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network");
		}

	}

}
