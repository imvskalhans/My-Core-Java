package com.vishal;

import java.util.Scanner;

public class DemoArray 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size =s.nextInt();
	int num[]=new int[size];
	System.out.println("enter "+size+"numbers in array");
	for(int i=0;i<size;i++)
	{
		num[i]=s.nextInt();
	}
	System.out.println("stored vslues in array are:");
	for(int i=0;i<size;i++)
	{
		System.out.println(num[i]);
	}
	}

}
