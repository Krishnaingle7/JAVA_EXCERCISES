package com.company;

class Pro
{
	private String itemNum;
	private String name;
	private double price;
	private int quantity;
	
	public String getItemNum()
	{
		return itemNum;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(double p)
	{
		price=p;
	}
	public void setQuantity(int q)
	{
		quantity=q;
	}
	//constructors
	public Pro(String itemnum,String namee)
	{
		itemNum=itemnum;
		name=namee;
	}
	public Pro(String itemnum,String namee,double p,int q)
	{
		itemNum=itemnum;
		name=namee;
		price=p;
		quantity=q;
	}
}
public class Product {

	public static void main(String[] args) {
		Pro pr=new Pro("A23-123","Shirt");
		pr.setPrice(999);
		pr.setQuantity(5);
		
		System.out.println("Itemnum: "+pr.getItemNum());
		System.out.println("Name: "+pr.getName());
		System.out.println("price: "+pr.getPrice());
		System.out.println("quantity: "+pr.getQuantity());
		
	}

}
