package com.vishal;

public class DemoOp2 
{
	public static void main(String[] args) 
	{
		int n1=0, n2=3, n3=4, n4=5, n5=7, res;
		res=--n1 + --n2 + n3-- + n4++ + ++n5;
		System.out.println(res);
		res=n1++ +n2-- + ++n3 + n4++ + n5++;
		System.out.println(res);
		res=++n1 + --n2 + ++n3 + --n4 + ++n5;
		System.out.println(res);
		
	}

}
