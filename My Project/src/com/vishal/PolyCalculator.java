package com.vishal;

public class PolyCalculator 
{
	public int add()
	{
		int n1=10, n2=20, res;
		res=n1+n2;
		return res;
	}
	public double add()
	{
		double n1=0.40, n2 = 10.47 , res;
		res= n1+n2;
		return res;
	}
	public  void add(int n1)
	{
		int n2=25, res;
		res =n1+n2;
		System.out.println(res);
	}
	public void add(int n1, int n2)
	{
		int res;
		res = n1+n2;
		System.out.println(res);
	}
	public void add(int n1 , int n2, int n3)
	{
		int res;
		res = n1+n2+n3;
		System.out.println(res);
	}
	public void add(int n1, double n2)
	{
		double res;
		res=n1+n2;
		System.out.println(res);
	}
	public void add(double n1, int n2)
	{
		double res;
		res = n1+n2;
		System.out.println(res);
		
	}

}
