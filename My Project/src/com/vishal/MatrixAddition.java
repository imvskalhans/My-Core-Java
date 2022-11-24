package com.vishal;

import java.util.Scanner;

public class MatrixAddition 
{
	public static void main(String[] args) 
	 {
/*
		
		System.out.println("enter the no of rows and columns ");
		 Scanner s=new Scanner(System.in);
		 int r=s.nextInt();
		 int c=s.nextInt();
		 System.out.println("enter the "+r*c+ "values for two d array");
		 int arr[][]=new int[r][c];
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr[i][j]=s.nextInt();
			 }
		 }
		 System.out.println("the entered array in 2d matrix form");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 System.out.print(arr[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
	
	

		 System.out.println("enter the no of rows and columns ");
		 Scanner s2=new Scanner(System.in);
		 int r2=s.nextInt();
		 int c2=s.nextInt();
		 System.out.println("enter the "+r2*c2+ "values for two d array");
		 int arr2[][]=new int[r][c];
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr2[i][j]=s.nextInt();
			 }
		 }
		 System.out.println("the entered array in 2d matrix form");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 System.out.print(arr2[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
		 int arr3[][]=new int[r][c];
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 arr3[i][j]=arr[i][j]+arr2[i][j];
		 }
	 }
	 System.out.println("the sum of matrix array in 2d matrix form");
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 System.out.print(arr3[i][j]+" ");
			 
		 }
		 System.out.println();
	 }
	
}

*/
	
	
	
		System.out.println("enter the no of rows and columns ");
		 Scanner s=new Scanner(System.in);
		 int r=s.nextInt();
		 int c=s.nextInt();
		
		 int arr[][]=new int[r][c];
		 int arr2[][]=new int[r][c];
		 int res[][]=new int[r][c];
		 System.out.println("enter the "+r*c+ "values for two d array for matrix 1"); 
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr[i][j]=s.nextInt();
			 }
		 }
		 System.out.println("enter the "+r*c+ "values for two d array for matrix 2"); 
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr2[i][j]=s.nextInt();
			 }
		 }
		 for(int i=0;i<r;i++)
		 {                                                                                                                            
			 for(int j=0;j<c;j++)
			 {
				 res[i][j]=arr[i][j]+arr2[i][j];
			 }
		 }

		 System.out.println("the sum of matrix array in 2d matrix form");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 System.out.print(res[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
	
	
	 }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
