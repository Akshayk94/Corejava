package test;

import java.sql.SQLException;

public class ExceptionDemo9 
{
	static void firstmethod() throws SQLException
	{
		throw new SQLException();
	}
	
	static void secondmethod() throws SQLException
	{
		firstmethod();
	}
	
	static void thirdmethod() throws SQLException
	{
		secondmethod();
	}
	
	public static void main(String[] args) throws SQLException 
	{
		System.out.println("PROGRAM STARTED");
		
		thirdmethod();
		
		System.out.println("PROGRAM ENDED");
	}

}
