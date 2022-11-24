package com.vishal;

import java.io.InputStream;
import java.util.Scanner;

public class demo6 
	{
		public static void main() 
		{
			int num, count = 1;
			Scanner s=new Scanner(System.in)
			System.out.println("enter number");
			num=s.nextInt();  
			while(num!=0)
			{
				count=count*10;
				num=num%10;
				count=num;
			}
			System.out.println("reverse digit"+count);
			
		}

		}
	
