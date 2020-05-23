package test;

public class MainApp1 
{
	public static void main(String[] args) 
	{
		//IMPLICIT THREAD CREATION
		
		//1st THREAD
		MyThread m1=new MyThread();
		
		//2nd THREAD
		MyThread m2=new MyThread();
		
		//start the execution of thread
		m1.start();
		m2.start();
	}
}
