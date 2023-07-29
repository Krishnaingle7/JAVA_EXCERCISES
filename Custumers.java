package com.company;

class Cus
{
	private String  custID;
	private String name;
	private String address;
	private String phoneNo;
	//getter and setter
	public String getCustID()
	{
		return custID;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public void setPhoneNo(String p)
	{
		phoneNo=p;
	}
	//Constructors
	public  Cus(String custid,String Name)
	{
		custID=custid;
		name=Name;
	}
	public  Cus(String custid,String Name,String Address,String Phoneno)
	{
		custID=custid;
		name=Name;
		address=Address;
		phoneNo=Phoneno;
	}
}
public class Custumers {

	public static void main(String[] args) {
		Cus c=new Cus("A7-87654","Krishna");
		c.setAddress("178-C,Lotus park colony,Indore,M.P");
		c.setPhoneNo("+91-9977570174");
		
		System.out.println("CustID: "+c.getCustID());
		System.out.println("Name: "+c.getName());
		System.out.println("Add: "+c.getAddress());
		System.out.println("phoneno: "+c.getPhoneNo());

	}

}
