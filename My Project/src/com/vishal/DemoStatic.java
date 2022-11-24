package com.vishal;

public class DemoStatic 
{
	static String name="I'm Static variable";
	static int age=82468244;
	public static void details()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
	public static void main(String[] args)
	{
		DemoStatic.details();
		System.out.println("execution completed");
		System.out.println(" age is "+DemoStatic.age);
	}
	
}
