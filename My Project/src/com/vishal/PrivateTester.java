package com.vishal;

public class PrivateTester 
{
	public static void main(String[] args) 
	{
		DemoPrivate d1=new DemoPrivate();
		d1.display2();
		System.out.println("name is = "+d1.name2);
		DemoPrivate d=new DemoPrivate();
		d.display();
		System.out.println("name is = "+d.name);
		
}
} 