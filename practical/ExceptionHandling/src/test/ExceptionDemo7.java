package test;

public class ExceptionDemo7 
{

	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		
		try
		{
			int c=10/0;
			
			System.out.println("C VALUE IS "+c);
		}
		catch(NullPointerException e)
		{
			System.out.println("CATCH BLOCK EXECUTED");
		}
		finally
		{
			System.out.println("FINALLY BLOCK EXECUTED");
		}
		
		System.out.println("PROGRAM ENDED");

	}

}
