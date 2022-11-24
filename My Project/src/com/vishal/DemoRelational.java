package com.vishal;

public class DemoRelational
{
	public static void main(String[] args) 
	{
		int n1=10,n2=11;
		System.out.println("n1 = "+n1 + " n2 = "+n2);
		if(n1!=n2)
		{
			System.out.println("n1 is not equals to n2");
			System.out.println(n1>n2);
			System.out.println("n1 equals to n2 "+(n1==n2));
			if(n1>n2)
			{
				System.out.println("n1 is greater than n2");
				
			}
			else
			{
				System.out.println("n2 is greater than n1");
			}
		}
		else
		{
			System.out.println("n1 is equal to n2");
		}
		int a=25,b=18,c=20;
		if((a<b)!= (c>b ))
				{
					System.out.println("true");
				}
		else
		{
			System.out.println("false");
		}
		
		
		
	}

}
