package sets;

import java.util.HashSet;
import java.util.Scanner;

public class HashDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("ENTER LOWER LIMIT");
		int lower=sc1.nextInt();//30
		
		System.out.println("ENTER HIGHER LIMIT");
		int higher=sc1.nextInt();//50
		
		HashSet<Integer> oddnumbers=new HashSet<Integer>();
		
		HashSet<Integer> evennumbers=new HashSet<Integer>();
		
		for(int i=lower;i<=higher;i++)
		{
			if(i%2==0)
			{
				evennumbers.add(i);
			}
			else
			{
				oddnumbers.add(i);
			}
		}
		
		System.out.println("EVEN NUMBERS ARE");
		
		for(Integer i:evennumbers)
		{
			System.out.print(i+"\t");
		}
		System.out.println("**********************");
		
		System.out.println("ODD NUMBERS ARE");
		
		for(Integer i:oddnumbers)
		{
			System.out.print(i+"\t");
		}
	}
}
