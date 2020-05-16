package test;

public class ExceptionDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("PORGRAM STARTED");
		
		try
		{
			int c=10/0;
			
			String str=null;
			
			System.out.println("STR VALUE IS "+str.length());
			
			System.out.println("C VALUE IS "+c);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("PROGRAM ENDED");
	}
}
