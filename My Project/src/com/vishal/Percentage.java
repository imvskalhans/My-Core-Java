package com.vishal;

import java.util.Scanner;

public class Percentage 
{
	public static void main(String[] args) 
	{
		int eng,hindi,phy,chem,maths;
		float total,per;
		Scanner s=new Scanner(System.in);
		System.out.println("enter english marks");
		eng=s.nextInt();
		System.out.println("enter hindi marks");
		hindi=s.nextInt();
		System.out.println("enter phy marks");
		phy=s.nextInt();
		System.out.println("enter chemistry number");
		chem=s.nextInt();
		System.out.println("enter maths marks");
		maths=s.nextInt();
		System.out.println("entered marks are eng"+eng+ "hindi="+hindi +"phy="+phy +"chem="+chem +"maths="+maths);
		
		total=eng+hindi+phy+chem+maths;
		System.out.println("total marks = "+total);
		per=(total/500)*100;
		System.out.println("percentage= "+per+"%");
	}
}
