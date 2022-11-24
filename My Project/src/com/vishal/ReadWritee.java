
package com.vishal;

import java.util.Scanner;

public class ReadWritee 
{
	public static void main(String[] args)
	{
		String name;
		int age;
		Scanner  s = new Scanner(System.in);
		System.out.println(" Enter your name");
		name = s.nextLine();
		System.out.println("enter your age");
		age = s.nextInt();
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		
		
	}

}
