package com.company;

public class Sorting_ArrayOF_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A[]= {"java","python","pascal","smalltalk","ada","basic"};
		
		java.util.Arrays.sort(A);
		
		for(String x:A)
		{
			System.out.println(x);
		}
	}
}

