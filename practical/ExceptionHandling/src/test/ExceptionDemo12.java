package test;

import java.util.Scanner;

public class ExceptionDemo12 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("ENTER PRODUCT WEIGHT IN KG");
		int qty=sc1.nextInt();
		
		checkProductQuantity(qty);
	}
	
	static void checkProductQuantity(int weight)
	{
		if(weight<200)
		{
			throw new InvalidProductException("WEIGHT IS INVALID");
		}
		else
		{
			System.out.println("PRODUCT ACCEPTED");
		}
	}
}
