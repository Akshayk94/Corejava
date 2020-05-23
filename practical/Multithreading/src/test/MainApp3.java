package test;

public class MainApp3 
{

	public static void main(String[] args) 
	{
		//1st thread
		PrintNumbers p1=new PrintNumbers();
		
		//2nd thread
		PrintNumbers p2=new PrintNumbers();
		
		//3r thread
		PrintNumbers p3=new PrintNumbers();
		
		p1.start();
		
		
		p2.start();
		try 
		{
			p2.join();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		p3.start();
		

	}

}
