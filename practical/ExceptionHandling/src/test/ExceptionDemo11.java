package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Read the data from external text file*/
public class ExceptionDemo11 
{
	public static void main(String[] args) 
	{
		FileReader frd=null;
		
		try 
		{
			frd=new FileReader("G:\\PECW3\\welcome1.txt");
		
			int i;
			
			while((i=frd.read())!=-1)
			{
				System.out.print((char)i);
			}
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				frd.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
