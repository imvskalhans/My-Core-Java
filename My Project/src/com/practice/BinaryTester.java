package com.practice;

import java.util.Scanner;

import com.vishal.BinarySearch;

public class BinaryTester 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the size of array");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("enter the sorted arr of size"+size);
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] =s.nextInt();
		}
		System.out.println("enter the number to be searched");
		int key=s.nextInt();
		int last=arr.length-1;
		BinarySearch b=new BinarySearch();
		b.binarySearch(0, last, arr, key);
		
		
		
		
	}

}
