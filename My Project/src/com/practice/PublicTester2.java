package com.practice;

import com.vishal.DemoPublic2;

public class PublicTester2 
{
	public static void main(String[] args)
	{
		System.out.println("hello DemoTester2");
		String name="vishal";
		int age=21;
		System.out.println("name= "+name);
		System.out.println("age = "+age);
		DemoPublic2 d=new DemoPublic2();
		d.demoVishal(args);
		System.out.println("welcome back to demo tester2");
		System.out.println("name in demo vishal"+d.name);
		System.out.println("age in demo vishal "+d.age);
		d.demoVishal(args);
		
		
	} 
}
