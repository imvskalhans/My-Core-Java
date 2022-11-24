package com.vishal;

import java.util.Scanner;

public class IOmethod 
{
	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name ");
		name=s.nextLine();
		System.out.println("enter your age ");
		age=s.nextInt();
		System.out.println("my name is "+name);
		System.out.println("your age is "+age);
	}
	
}
