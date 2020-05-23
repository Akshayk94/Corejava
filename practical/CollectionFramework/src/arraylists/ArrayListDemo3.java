package arraylists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3
{
	public static void main(String[] args) 
	{
		//NON-GENERIC ARRAYLIST
		ArrayList al1=new ArrayList();
		al1.add("java");
		al1.add(20);
		al1.add('K');
		
		for(Object o:al1)
		{
			System.out.println(o);
		}
		
		System.out.println("********************");
		
		Iterator itr=al1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
