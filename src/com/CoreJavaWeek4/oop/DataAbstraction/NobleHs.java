package com.CoreJavaWeek4.oop.DataAbstraction;

//Multiple inheritance in java we can achieve using interface
public class NobleHs implements IMA,USMA
{

	
	public void medical()
	{
		System.out.println("NobleHs.......Medical()");
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs.......cardio()");

		
	}

	@Override
	public void physio() {
		System.out.println("NobleHs.......physio()");

		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs......Dental()");

		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.......Nero()");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs......covid19Test()");

		
	}
}
