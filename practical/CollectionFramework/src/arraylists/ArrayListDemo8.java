package arraylists;

import java.util.ArrayList;

public class ArrayListDemo8 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("CRICKET");
		list1.add("HOCKEY");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("CHESS");
		list2.add("FOOTBALL");
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		for(String s:list1)
		{
			System.out.println(s);
		}
		System.out.println("-----------------");
		for(String s:list2)
		{
			System.out.println(s);
		}
		System.out.println("-----------------");
		for(String s:list3)
		{
			System.out.println(s);
		}
	}

}
