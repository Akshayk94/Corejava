package vectors;

import java.util.Vector;

public class VectorDemo1 
{
	public static void main(String[] args) 
	{
		Vector<String> list1=new Vector<String>();
		list1.add("MOBILE");
		list1.add("LAPTOP");
		list1.add("SPEAKER");
		list1.add("HEADPHONES");
		
		for(String s:list1)
		{
			System.out.println(s);
		}
	}
}
