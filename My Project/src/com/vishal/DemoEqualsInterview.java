package com.vishal;

public class DemoEqualsInterview 
{
	public static void main(String[] args)
	{
		
	
	String s1="XYZ";
	String s2= new String("XYZ");
	String s3="XYZ";
	if(s1==s2)
	{
		System.out.println("true for operator");
		
	}
	else
	{
		System.out.println("false for operator");
	}
	
	if(s1==s3)
	{
		System.out.println("true for operator");
		
	}
	else
	{
		System.out.println("false for operator");
	}
	if(s1.equals(s2))
	{
		System.out.println("true for equals method");
		
	}
	else
	{
		System.out.println("false  for equals method");
	}
	if(s1.equals(s3))
	{
		System.out.println("true  for equals method");
		
	}
	else
	{
		System.out.println("false  for equals method");
	}
	}
}
