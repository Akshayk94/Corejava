package arraylists;

import java.util.ArrayList;

public class ArrayListDemo5
{

	public static void main(String[] args)
	{
		//GENERIC ARRAYLIST
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		al1.add(20);
		al1.add(10);
		al1.add(40);
		
		for(Integer i:al1)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		//MANIPULATION 
		
		al1.add(1, 30);
		al1.add(60);
		
		for(Integer i:al1)
		{
			System.out.println(i);
		}
		
		System.out.println("------------------------------");

		al1.set(2, 80);     //modify existing object
		al1.remove(3);
		al1.add(100);
		//al1.remove(20);
		
		for(Integer i:al1)
		{
			System.out.println(i);
		}
		
		System.out.println("TOTAL ELEMENTS OF ARRAYLIST ARE "+al1.size());

	}

}
