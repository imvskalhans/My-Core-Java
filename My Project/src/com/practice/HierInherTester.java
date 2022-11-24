package com.practice;

import com.vishal.HierInherDog;
import com.vishal.HierInherTiger;

public class HierInherTester 
{
	public static void main(String[] args) 
	{
		HierInherDog d=new HierInherDog();
		d.eat();
		d.bark();
		
		
		HierInherTiger t=new HierInherTiger();
		t.roar();
		t.eat();
		t.sleep();
	}

}
