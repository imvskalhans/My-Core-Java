package com.vishal;

public class DemoPrivate 
{
	private int age=21;
	private String name="vishal";
	public String name2="im public vishal";
	private void display()
	{
		System.out.println("age is "+age);
	
	}
	public void display2()
	{
		System.out.println("hey im public in demo private");
	}
	public static void main(String[] args) 
	{
		DemoPrivate d=new DemoPrivate();
		d.display2();
		System.out.println("name is ="+d.name);
		d.display();
		System.out.println("name is = "+d.name2);
	}
}
