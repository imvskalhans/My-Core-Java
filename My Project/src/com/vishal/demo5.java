package com.vishal;

import java.util.Scanner;

public class demo5 
{
	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number");
		n1=s.nextInt();
		System.out.println("enter second number");
		n2=s.nextInt();
		int res = n1%n2;
		System.out.println("mod value is"+res);
	}
}
