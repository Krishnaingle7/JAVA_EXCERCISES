package com.company;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=9,b=12;
		byte c;
		
		c=(byte)(9<<4);
		c=(byte)(c|12);
		
		System.out.println((c&0b11110000)>>4);
		System.out.println(c&0b00001111);

	}

}
