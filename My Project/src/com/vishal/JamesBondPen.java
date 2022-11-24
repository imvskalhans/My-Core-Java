package com.vishal;

public class JamesBondPen extends PenInheritance
{
	String name="James Bonds Pen";
	public void triggerBomb()
	{
		System.out.println("trigger bomb using james bond pen");
		System.out.println("name1 : "+name);
		System.out.println("name2 using super keyword : "+super.name);
	}

}
