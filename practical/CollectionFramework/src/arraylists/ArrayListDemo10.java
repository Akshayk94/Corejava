package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo10
{
	public static void main(String[] args)
	{
		List<String> str1=new ArrayList<String>();//upcasting
		str1.add("java");
		str1.add("j2ee");
		str1.add("sql");
		str1.add("selenium");
		str1.add("manual");
		
		for(String s: str1)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------");
		List<String> newlist=str1.subList(0, 2);
		
		for(String s:newlist)
		{
			System.out.println(s);
		}
	}
}
