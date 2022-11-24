package com.vishal;

import java.util.Scanner;

public class FibbonacciSeries 
{
	public static void main(String[] args)
	{
		int term,a=0,b=1,fib=0;
		System.out.println("enter the no of term in fibonacci series");
		Scanner s=new Scanner(System.in);
		term=s.nextInt();
		System.out.println("fibonacci series "+"\n"+a +"\n" +b);
		for(int i=3;i<=term;i++)
		{
			fib=a+b;
			System.out.println(fib);
			a=b;
			b=fib;
		}
	}

}
