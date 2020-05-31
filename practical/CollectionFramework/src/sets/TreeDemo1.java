package sets;

import java.util.TreeSet;

public class TreeDemo1 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(560);
		ts1.add(120);
		ts1.add(320);
		ts1.add(40);
		ts1.add(600);
		ts1.add(320);
		
		for(Integer i:ts1)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************");
		
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("MANUAL");
		ts2.add("ANGULAR");
		ts2.add("WT");
		ts2.add("JAVA");
		
		for(String s:ts2)
		{
			System.out.println(s);
		}
		
		System.out.println("******************");
		
		/*TreeSet ts3=new TreeSet();
		ts3.add(20);
		ts3.add('A');
		ts3.add("JAVA");
		
		for(Object o:ts3)
		{
			System.out.println(o);
		}*/
	}

}
