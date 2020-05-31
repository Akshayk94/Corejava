package arraylists;

import java.util.ArrayList;

public class ArrayListDemo4
{

	public static void main(String[] args) 
	{
		ArrayList<String> al1=new ArrayList<String>();
		
		al1.add("JAVA");      // Oth position
		al1.add("AUTOMATION");//1
		al1.add("MANUAL");		//2
		al1.add(1,"ANGULAR");	//3
		al1.add(3,"WEB TECH");	//4
		al1.remove(2);
		
		for(String s:al1)
		{
			System.out.println(s);
		}
		
	}

}
