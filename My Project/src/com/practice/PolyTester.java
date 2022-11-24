package com.practice;

import com.vishal.PolyCalculator;

public class PolyTester 
{
	public static void main(String[] args) 
	{
		PolyCalculator c=new PolyCalculator();
		int res=c.add();
		System.out.println(res);
		double res2=c.add();
		System.out.println(res2);
		c.add(10);
		c.add(5,7);
		c.add(2,4,8);
		c.add(4,0.78);
		c.add(0.799,12);
		
	}

}
