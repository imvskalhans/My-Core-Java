package com.vishal;

import java.util.Scanner;

public class DemoPublic2 
{
	public String name="Vishal";
	public int age=21;
	public void demoVishal(String [] args)
	{
		System.out.println("you are now in method demoVishal");
		int a,b,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum = "+sum);
		
	}
	

}
