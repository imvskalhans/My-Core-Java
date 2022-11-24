package com.vishal;

public class DemoLocal 
{
	public void display()
	{
		String cityName ="Vishal's City";
		int  population = 11;
		System.out.println("my city "+cityName);
		System.out.println("population is "+population);
		
	}
	public static void main(String[] args) 
	{
		DemoLocal d=new DemoLocal();
		d.display();
		System.out.println("excution over");
		
	}

}
