package linkedlists;

import java.util.LinkedList;

public class LiknedListDemo 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> nolist=new LinkedList<Integer>();
		nolist.add(50);
		nolist.add(100);
		nolist.add(150);
		nolist.addFirst(25);
		nolist.addLast(200);
		nolist.add(300);
		nolist.add(50);
		nolist.add(null);
		nolist.add(null);
		
		for(Integer i:nolist)
		{
			System.out.println(i);
		}
	}
}
