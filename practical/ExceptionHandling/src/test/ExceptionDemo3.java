package test;

public class ExceptionDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		
		try
		{
			String str=null;
			
			System.out.println(str.length());
			
			System.out.println("TRY BLOCK ENDED");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("PROGRAM ENDED");
	}
}
