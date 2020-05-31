package arraylists;

import java.util.ArrayList;

public class ArrayListDemo6 
{

	public static void main(String[] args) 
	{
		ArrayList<String> cities1=new ArrayList<String>();
		cities1.add("MUMBAI");
		cities1.add("PUNE");
		cities1.add("BANGLORE");
		
		ArrayList<String> cities2=new ArrayList<String>();
		cities2.add("PARIS");
		cities2.add("LONDON");
		cities2.add("FRANKFURT");
		
		cities2.addAll(cities1);
		
		for(String s: cities2)
		{
			System.out.println(s);
		}
		
		System.out.println("*************************************");
		
		//NON-GENERIC LIST
		ArrayList numbers1=new ArrayList();
		numbers1.add(40);
		numbers1.add(60);
		
		ArrayList numbers2=new ArrayList();
		numbers2.add("80");
		numbers2.add("50");
		
		numbers2.addAll(numbers1);
		
		for(Object o:numbers2)
		{
			System.out.println(o);
		}
	}

}
