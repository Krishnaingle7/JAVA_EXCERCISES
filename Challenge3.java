package com.company;

public class Challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a!B@c#1$2%3";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
		
		String str1="abc  de  fgh  ijk";
		System.out.println(str1.replaceAll("\\s+"," "));
		
		String str2="   abc  de  fgh  ijk   ";
		str2=str2.replaceAll("\\s+"," ").trim();
		String words[]=str2.split("\\s");
		System.out.println(words.length);

	}

}
