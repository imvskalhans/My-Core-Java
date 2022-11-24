package com.vishal;

import java.util.Scanner;

public class MatrixTranspose 
{
	public static void main(String[] args) 
	{

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
		 int arr2[][]=new int[c][r];
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 arr2[j][i]=arr[i][j];
			 }
		 }
		 
		 
		 System.out.println("the transpose of the entered array in 2d matrix form");
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 System.out.print(arr2[i][j]+" ");
				 
			 }
			 System.out.println();
		 }
		
	}

}
