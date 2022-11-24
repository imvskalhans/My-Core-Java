package com.vishal;

public class DemoFinal5 
{
	final int AGE=21;
	int m = 18;
	
	public void display()
	{
		System.out.println("age = "+AGE);
		System.out.println(m);
		//AGE =22;
		System.out.println("age is "+AGE);
	}
	public static void main(String[] args) 
	{
		DemoFinal5 d5=new DemoFinal5();
		d5.display();
		
		System.out.println("age = "+d5.AGE);
		
		/*
		 * AGE=AGE+1; System.out.println("age = "+d5.AGE);
		 */
		
	}
	

}
