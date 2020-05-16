package test;

public class ExceptionDemo5
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		
		try
		{
			System.out.println("TRY BLOCK STARTED");
			
			try
			{
				int c=10/0;
				
				System.out.println("C VALUE IS "+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
			String course=null;
			
			System.out.println(course.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println("PROGRAM ENDED");
	}
}
