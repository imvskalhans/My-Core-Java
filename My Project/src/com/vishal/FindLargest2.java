package com.vishal;

import java.util.Scanner;

public class FindLargest2 
{
	public static void main(String[] args) 
	{
		int a,b,c,d;
		Scanner s=new Scanner (System.in);
		System.out.println("enter 4 numbers a,b, c, d respectevily ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("a is largest");
			
		}
		else if ((b>a)&&(b>c)&&(b>d))
		{
			System.out.println("b is largest");
			
		}
		else if ((c>a)&&(c>b)&&(c>d))
		{
			System.out.println("c is largest");
		}
		else
		{
			System.out.println("d is largest");
		}
		
	}

}
