package com.vishal;

public class DemoEqualsIgnoreCase 
{
	public static void main(String[] args) 
	{
		String s1="heyyy Shreyyyy";
		String s2=s1.toUpperCase();
		String s3=s2.toLowerCase();
		String s4="";
		System.out.println(s2);
		System.out.println(s3);
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
	 System.out.println((s4.isEmpty())); 
		

	}


}
