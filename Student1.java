package com.company;

class Student
{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	public float avg()
	{
		return (m1+m2+m3)/3f;
	}
	public char grade()
	{
		if(avg()>=60)
			return 'A';
		else
			return 'B';
	}
	public String details()
	{
		return "Roll no:"+roll+"\n"+"Name:"+name+"\n"+"Couse:"+course+"\n";
	}
}
public class Student1 {

	public static void main(String[] args) {
		Student s=new Student();
		s.roll=7;
		s.name="Krishna";
		s.course="CSE";
		s.m1=70;
		s.m2=80;
		s.m3=65;
		
		System.out.println("Total: "+s.total());
		System.out.println("Average: "+s.avg());
		System.out.println("Grade: "+s.grade());
		System.out.println("Details:>\n"+s.details());

	}

}
