package com.SimpleInterest;

import java.util.Scanner;

public class Businessman 
{
	private float si;
	private float p;
	private float t;
	static private float r;

	static 
	{
		r = 15.2f;
	}
	
	public void acceptInput() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		si = scan.nextFloat();
		System.out.println("Enter the tenure");
		t = scan.nextFloat();
	}
	
	public void calcInterest() 
	{
		si = (p*t*r)/100;
	}
	
	public void disp() 
	{
		System.out.println(si);
	}
}	
	

