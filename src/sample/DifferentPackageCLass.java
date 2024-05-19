package sample;

import com.CoreJavaWeek4.oop.Inheritance.AccessModifiers;

public class DifferentPackageCLass extends AccessModifiers {

	public static void main(String[] args)
	{

		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.name);
		
		
		DifferentPackageCLass d1=new DifferentPackageCLass();
		System.out.println(d1.name);
		System.out.println(d1.acno);

	}

}
