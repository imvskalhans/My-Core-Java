package com.vishal;

import java.util.Scanner;

public class DemoMod 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		int rem=a%b;
		System.out.println("a%b= "+rem);
		
	}

}
