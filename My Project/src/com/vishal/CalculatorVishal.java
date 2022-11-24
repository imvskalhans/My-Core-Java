package com.vishal;

import java.util.Scanner;

public class CalculatorVishal 
{
	public static void main(String[] args) 
	{
		int a,b;
		float sum,sub,mul,div;
		Scanner s=new Scanner(System.in);
		System.out.println("enetr two numbers");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("sum= "+sum);
		sub=a-b;
		System.out.println("sub= "+sub);
		mul=a*b;
		System.out.println("multiply= "+mul);
		div=a/b;
		System.out.println("div= "+div);
		
		
		
	}

}
