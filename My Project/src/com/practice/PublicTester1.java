package com.practice;

import com.vishal.DemoPublic;

public class PublicTester1 
{
	public static void main(String[] args) 
	{
		DemoPublic d=new DemoPublic();
		d.display();
		System.out.println("city name in tester class "+d.cityName);
		System.out.println("population in tester class "+d.population);
	}
}
