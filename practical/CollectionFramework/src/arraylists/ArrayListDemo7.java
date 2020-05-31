package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo7
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(70);
		list1.add(150);
		list1.add(10);
		list1.add(45);
		list1.add(175);
		list1.add(105);
		list1.add(55);
		
		System.out.println("SEQUENCE MANNER");
		for(Integer i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		System.out.println("ASC ORDER");
		
		Collections.sort(list1);
		
		for(Integer i:list1)
		{
			System.out.println(i);
		}

		System.out.println("--------------------");
		
		System.out.println("DESC ORDER");
		
		Collections.sort(list1, Collections.reverseOrder());
		
		for(Integer i:list1)
		{
			System.out.println(i);
		}

		
	}

}
