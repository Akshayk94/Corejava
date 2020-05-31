package sets;

import java.util.LinkedHashSet;

public class HashDemo3 
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> list1=new LinkedHashSet<String>();
		list1.add("JAVA");
		list1.add("SQL");
		list1.add("SELENIUM");
		list1.add("JAVA");
		list1.add("WT");
		
		for(String s:list1)
		{
			System.out.println(s);
		}
	}

}
