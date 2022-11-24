package com.vishal;

import java.util.Scanner;

public class DemoSwitch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the option number");
		int option=s.nextInt();
		switch(option)
		{
		
		
			case 1 : System.out.println("case 1 executed ");
			break;
			case 2 : System.out.println("case 2 executed ");
			break;
			case 3 : System.out.println("case 3 executed ");
			break;
			default : System.out.println("default executed ");
			
			
		}
		
		
	}

}
