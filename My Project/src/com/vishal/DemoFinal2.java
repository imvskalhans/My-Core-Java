package com.vishal;

public class DemoFinal2 extends DemoFinal
{
	public void display()   //we can not over write this method because final mark on method
	{
		System.out.println("display method running in class xyz");
	}

}
