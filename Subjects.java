package com.company;

class Sub
{
	private String subID;
	private String subname;
	private int maxMarks;
	private int marksObtain;
	//getter and setter
	public String getSubID()
	{
		return subID;
	}
	public String getSubname()
	{
		return subname;
	}
	public int getMaxMarks()
	{
		return maxMarks;
	}
	public int getMarksObtain()
	{
		return marksObtain;
	}
	public void setMaxMarks(int mm)
	{
		maxMarks=mm;
	}
	public void setMarksObtain(int mo)
	{
		marksObtain=mo;
	}
	public boolean isQualified()
	{
		return marksObtain>=maxMarks/10*4;
	}
	public String toString()
	{
		return "\nSubID:"+subID+"\nSubName:"+subname+"\nMaxMarks:"+maxMarks+"\nMarksObtained:"+marksObtain;
	}
	//constructors
	public Sub (String subid,String name)
	{
		subID=subid;
		subname=name;
	}
	public Sub(String subid,String name,int mm,int mo)
	{
		subID=subid;
		subname=name;
		maxMarks=mm;
		marksObtain=mo;
	}
}
public class Subjects {

	public static void main(String[] args) {
		Sub subs[]=new Sub[3];
		subs[0]=new Sub("BT-201","OOPs",100,50);
		subs[1]=new Sub("BT-202","DSA",100,20);
		subs[2]=new Sub("BT-203","Cloud",100,70);
		
		
		for(Sub s:subs)
			System.out.println(s);
	}

}
