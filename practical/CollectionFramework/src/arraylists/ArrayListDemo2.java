package arraylists;

import java.util.ArrayList;

public class ArrayListDemo2 
{

	public static void main(String[] args) 
	{
		//GENERIC ARRAYLIST===>SAME TYPE OF DATA
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("PUNE");
		al1.add("MUMBAI");
		al1.add("BANGLORE");
		al1.add("CHENNAI");
		
		for(int i=0;i<al1.size();i++) //for-loop
		{
			System.out.println(al1.get(i));
		}
		System.out.println("***********************");
		
		for(String s:al1)  //for-each loop or extended for loop
		{
			System.out.println(s);
		}

	}

}
