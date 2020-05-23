package arraylists;

import java.util.ArrayList;

public class ArrayListDemo1
{

	public static void main(String[] args) 
	{
		//NON- GENERIC ARRAYLIST===>DIFFERENT TYPE OF DATA
		ArrayList al1=new ArrayList();
		
		al1.add(50);
		al1.add("JAVA");
		al1.add('A');
		al1.add(14.25);
		al1.add(true);
		
		
		System.out.println(al1);

	}

}
