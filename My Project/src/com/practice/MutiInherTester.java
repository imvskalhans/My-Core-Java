package com.practice;

import com.vishal.MultiInherDog;
import com.vishal.MultiInherTiger;

public class MutiInherTester 
{
	public static void main(String[] args) 
	{
		MultiInherDog d=new MultiInherDog();
		d.eat();
		d.bark();
		d.roar();
		d.run();
		d.sleep();
		
		MultiInherTiger t=new MultiInherTiger();
		t.roar();
		t.eat();
		t.sleep();
	}
}
