package com.vishal;

public class DemoInstance 
{
	String name;
	int age;
	public void details()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	public static void main(String[] args)
	{
		DemoInstance d=new DemoInstance();
		d.details();
		System.out.println("execution completed");
	}
	
}
