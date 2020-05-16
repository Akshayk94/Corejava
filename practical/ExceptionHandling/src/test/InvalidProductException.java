package test;

//CUSTOM EXCEPTION CLASS
public class InvalidProductException extends RuntimeException
{
	public InvalidProductException(String s) 
	{
		super(s);
	}
}
