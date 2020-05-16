package test;

import java.util.Scanner;

public class ExceptionDemo6 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("ENTER No1");
		int no1=sc1.nextInt();
		
		System.out.println("ENTER NO2");
		int no2=sc1.nextInt();
		
		try
		{
			calculator(no1, no2);
		}
		catch(ArithmeticException e)
		{
			System.err.println("PROVIDE VALID INPUT");
		}
		System.out.println("PROGRAM ENDED");
	}
	
	static void calculator(int a,int b)
	{
		int c=a/b;
		
		System.out.println("C VALUE IS "+c);
	}
}
