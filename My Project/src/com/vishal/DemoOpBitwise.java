package com.vishal;

import java.util.Scanner;

public class DemoOpBitwise 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no to be left shiffted");
		a=s.nextInt();
		a=a<<1;
		System.out.println("after left shift = "+a);
		System.out.println("enter no to be right shiffted");
		b=s.nextInt();
		b=b>>1;
		System.out.println("after right shift = "+b);
		System.out.println("enter no to be zero fill  right shiffted");
		c=s.nextInt();
		c=c>>>1;
		System.out.println("after zero fill right shift = "+c);
		/*
		 * int n=10; n=n<<1; System.out.println(n);
		 */
		
	}

}
