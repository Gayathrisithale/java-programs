package travel;

import java.util.Scanner;

public class BusMainClass {
	public static void main(String args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the brand name");
		String brandName=sc.next();
		BUs bus1=new Bus(brandName),"jabbar-travles","sleeper");
	}

}
