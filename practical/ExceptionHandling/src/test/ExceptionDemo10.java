package test;

import java.io.FileWriter;
import java.io.IOException;

/* Create an external text file from java class  */
public class ExceptionDemo10
{

	public static void main(String[] args)
	{
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter("G:\\PECW3\\welcome.txt");
		
			fw.write("HELLO................this is an external text file created through java program");
			
			
			System.out.println("FILE CREATED SUCCESSFULLY");
		}
		catch (IOException e)//CHECKED EXCEPTION
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
