package com.vishal;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the factorial to be calculated");
		num=s.nextInt();
		if(num<0)
		{
			System.out.println("factorial does not exist");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
				
			}
			System.out.println("factorial = "+fact);
		}
		
	}

}
