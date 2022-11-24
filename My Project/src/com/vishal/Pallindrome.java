package com.vishal;

import java.util.Scanner;

public class Pallindrome 
{
	public static void main(String[] args) 
	{
		int num,rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		num=s.nextInt();
		int num2=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(num2==rev)
		{
			System.out.println("no is palindrome");
			
		}
		else
		{
			System.out.println("no is not pallindrome");
		}
	}

}
