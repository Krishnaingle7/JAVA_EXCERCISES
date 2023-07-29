package com.company;

class BankAccount
{
	private String accno;
	private String name;
	private String address;
	private String phno;
	private String dob;
	protected long balance;
	
	public BankAccount()
	{
		accno="";
		name="";
		address="";
		phno="";
		dob="";
		balance=0;
	}
	public BankAccount(String ac,String n,String a,String p,String d)
	{
		accno=ac;
		name=n;
		address=a;
		phno=p;
		dob=d;
		balance=0;
	}
	public String getAccno()
	{
		return accno;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhno()
	{
		return phno;
	}
	public String getDob()
	{
		return dob;
	}
	public long getBalance()
	{
		return balance;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public void setPhno(String p)
	{
		phno=p;
	}
}
class SavingsAccount extends BankAccount
{
	public SavingsAccount(long balance)
	{
		this.balance=balance;
	}
	public void deposit(long amount)
	{
		balance-=amount;
	}
	public void withdraw(long amount)
	{
		balance+=amount;
	}	
}
class LoanAccount extends BankAccount
{
	public LoanAccount(long balance)
	{
		this.balance=balance;
	}
	public void payEMI(long amount)
	{
		balance-=amount;
	}
	public void repay(long amount)
	{
		if(balance==amount)
			balance=0;
	}
}
public class Account {

	public static void main(String[] args) {
		BankAccount b= new BankAccount("20153879320","Krishna","Indore,MP","9977570174","17/04/2023");
		System.out.println(b.getAccno());
		System.out.println(b.getName());
		System.out.println(b.getAddress());
		
		SavingsAccount sa= new SavingsAccount(b.getBalance());
		sa.deposit(5000);
		System.out.println(sa.getBalance());
		sa.withdraw(2000);
		System.out.println(sa.getBalance());
		
		LoanAccount la= new LoanAccount(sa.getBalance());
		la.payEMI(1000);
		System.out.println(la.getBalance());
		la.repay(2000);
		System.out.println(la.getBalance());
	}

}
