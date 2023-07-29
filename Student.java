package com.company;

class Students
{
	private int rollNo;
	private String name;
	private String dep;
	private Subjects[] subjects;
	//getter and setter
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public String getDep()
	{
		return dep;
	}
	public Subjects[] getSubjects()
	{
		return subjects;
	}
	public void setSubjects(Subjects...s)
	{
		subjects=new Subjects[s.length];
		for(int i=0;i<s.length;i++)
		{
			subjects[i]=s[i];
		}
	}
	public String toString()
	{
		System.out.println("Student details :\n");
		System.out.println("Roll no:"+rollNo+"\nName:"+name+"\ndepartment:"+dep);
		
		if(subjects.length==0)
		{
			System.out.println("No subjects");
		}
		else
		{
			for(Subjects s:subjects)
			{
				System.out.println(s);
			}
		}
		return "";
	}
	//constructors
	public Students (int rollNo,String name,String dep)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.dep=dep;
		subjects=new Subjects[0];
	}
	public Students (int rollNo,String name,String dep,Subjects[]subs)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.dep=dep;
		setSubjects(subs);
	}
}
public class Student {

	public static void main(String[] args) {
		Subjects s[]=new Subjects[2];
		
		Students stud1=new Students(1,"Krishna","CSE");
		Students stud2=new Students(2,"Jack","IT");
		
		System.out.println(stud1);
		System.out.println(stud2);
	}

}
