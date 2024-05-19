package com.CoreJavaWeek4.oop.DataAbstraction;

public class HDFC implements RBI
{

	public void cust_Details()
	{
		System.out.println("HDFC.....CustDetails()");
	}

	@Override
	public void deposite() {
		System.out.println("HDFC......Deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC......Withdraw()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC......rateOfInterest is 8%()");
		
	}
	
	
	
}
