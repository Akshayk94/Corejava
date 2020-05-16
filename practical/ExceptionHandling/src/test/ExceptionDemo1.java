package test;

public class ExceptionDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		
		int a=20;
		int b=10;
		
		try
		{
			int c=a/b;
			System.out.println("C VALUE IS "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("PROGRAM ENDED");
	}
}
