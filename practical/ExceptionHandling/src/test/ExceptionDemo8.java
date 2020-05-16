package test;

import java.util.Scanner;

public class ExceptionDemo8 
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("ENTER YOUR AGE");
		int age=sc1.nextInt();
		
		validation(age);
	}
	
	static void validation(int age)
	{
		if(age>18)
		{
			System.out.println("ELIGIBLE FOR VOTING");
		}
		else
		{
			throw new ArithmeticException("AGE INVALID");
		}
	}

}
