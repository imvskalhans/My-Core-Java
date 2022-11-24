package com.vishal;

public abstract class AbstractChainingTiger extends AbstactChainingAnimal
{
	public void eat()
	{
		System.out.println("Tiger is eating");
	}
	public abstract void sleep();
	
	public void roar()
	{
		System.out.println("tiger is roaring");
	}

}
