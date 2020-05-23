package test;

public class MainApp2
{

	public static void main(String[] args) 
	{
		SampleThread s1=new SampleThread();
		
		SampleThread s2=new SampleThread();
		
		//EXPLICIT OBJECT OF THREAD CLASS
		Thread t1=new Thread(s1);
		
		Thread t2=new Thread(s2);
		
		t1.start();
		t2.start();

	}

}
