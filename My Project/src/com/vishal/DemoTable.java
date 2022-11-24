package com.vishal;

import java.util.Scanner;

public class DemoTable 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the table to be printed");
		int table=s.nextInt();
		switch(table)
		{
		case 1 : for(int i=1; i<=10;i++)
					{
						System.out.println("1 * "+i + "= "+i*1);
					}
		break;
		case 2 : for(int i=1; i<=10;i++)
					{
						System.out.println("2 * "+i + "= "+i*2);
					}
		break;
		case 3 : for(int i=1; i<=10;i++)
					{
						System.out.println("3 * "+i + "= "+i*3);
					}
		break;
		case 4 : for(int i=1; i<=10;i++)
					{
						System.out.println("4 * "+i + "= "+i*4);
					}
		break;
		case 5 : for(int i=1; i<=10;i++)
					{
						System.out.println("5 * "+i + "= "+i*5);
					}
		break;
		default : System.out.println(" i dont know the table");
		}
				
		
	}

}
