package com.company;

public class Validate_Name_Age {

	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z]\\s]+");
	}
	static boolean validate(int age)
	{
		if(age>=3 && age<=18)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String name="";
		int age = 18;
		System.out.println(validate("krishNA"));
		System.out.println(validate(18));

	}

}
