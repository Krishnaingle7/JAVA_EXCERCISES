package com.company;

class cylinder1
{
	private int radius;
	private int height;
	
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
	public void setRadius(int r)
	{
		if(r>=0)
			radius=r;
		else
			radius=0;
	}
	public void setHeight(int h)
	{
		if(h>=0)
		    height=h;
		else
			height=0;
	}
	public void setDimensions(int r,int h)
	{
		height=h;
		radius=r;
	}
	//constructors
	public cylinder1()
	{
		radius=height=1;
	}
	public cylinder1(int r,int h)
	{
		radius=r;
		height=h;
	}
	//methods of cylinder
	public double lidarea()
	{
		return Math.PI*radius*radius;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidarea()+circumference()*height;
	}
	public double volume()
	{
		return lidarea()*height;
	}
}
public class Cylinder {

	public static void main(String[] args) {
		cylinder1 C=new cylinder1();
		C.setRadius(10);
		C.setHeight(15);
		C.setDimensions(10,15);
		
		System.out.println("Lidarea: "+C.lidarea());
		System.out.println("totalsurfacearea : "+C.totalSurfaceArea());
		System.out.println("Circumference: "+C.circumference());
		System.out.println("Volume: "+C.volume());
		
		System.out.println("Radius: "+C.getRadius());
		System.out.println("Height: "+C.getHeight());

	}

}
