package com.vishal;

import java.util.Scanner;

public class DemoArrayWeekDays 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("How many days are there in week?");
	int size = s.nextInt();
	String num[]=new String[(size+1)];
	System.out.println("enter "+size+" days of a week");
	for(int i=0;i<size+1;i++)
	{
		num[i]=s.nextLine(); 
	}
	System.out.println("stored values in array are: ");
	for(int i=0;i<size+1;i++)
	{
		System.out.print(num[i]+"      ");
	}
	}


}
