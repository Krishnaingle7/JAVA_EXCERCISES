package com.company;

public class WideningNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=5;
		short s=120;
		int i=10;
		long l=10;
		//float f=10;
		float f=10.5f;
		double d=10;
		boolean b1=true;
		
		/*b=(byte)s;
		System.out.println(b);
		i=s;
		l=s;
		f=s;
		d=s;*/
		
		i=(int)f;
		System.out.println(i);
	}

}
