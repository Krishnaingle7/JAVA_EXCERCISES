package com.company;

class Cylinder
{
	public double radius;
	public double height;
	
	public double lidarea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidarea()+circumference()*height;
	}
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidarea()*height;
	}
}
public class Cylinder1 {

	public static void main(String[] args) {
		Cylinder Cyl=new Cylinder();
		Cyl.radius=7;
		Cyl.height=10;
		System.out.println("Lidarea: "+Cyl.lidarea());
		System.out.println("totalsurfacearea : "+Cyl.totalSurfaceArea());
		System.out.println("Circumference: "+Cyl.circumference());
		System.out.println("Volume: "+Cyl.volume());

	}

}
