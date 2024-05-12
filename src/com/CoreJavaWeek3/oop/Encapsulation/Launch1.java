package com.CoreJavaWeek3.oop.Encapsulation;

class Books
{
	//Encapsulation=private data+Public methods
	
	private int pageNo;
	
	//setter method --set the data
	public void setPageNo(int num)
	{
		if(num>=0)
		{
			this.pageNo=num;	
		}else
		{
			System.out.println("PageNumber is invalid!");
		}
		
	}
	
	//getter method --get the data
	public int getPageNo()
	{
		return this.pageNo;
	}
}




public class Launch1 {

	public static void main(String[] args)
	{

		Books b1=new Books();
		
		b1.setPageNo(101);
		System.out.println(b1.getPageNo());
		System.out.println("*****************");
		
		Books b2=new Books();
		b2.setPageNo(-12);
		//System.out.println(b2.getPageNo());
		
		//b1.pageNo=-10;
		//System.out.println(b1.pageNo);

	}

}
