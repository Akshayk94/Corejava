package test;

public class ExceptionDemo2
{

	public static void main(String[] args) 
	{
		System.out.println("PROGRAM STARTED");
		
		int[] arr1=new int[5];
		
		try
		{
			arr1[0]=10;
			arr1[6]=20;
			
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

		System.out.println("PROGRAM ENDED");
	}

}
