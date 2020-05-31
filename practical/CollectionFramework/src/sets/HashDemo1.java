package sets;

import java.util.HashSet;

public class HashDemo1
{

	public static void main(String[] args)
	{
		HashSet<Double> hs1=new HashSet<Double>();
		hs1.add(15.25);
		hs1.add(20.20);
		hs1.add(10.45);
		hs1.add(75.48);
		hs1.add(85.15);
		hs1.add(45.05);
		hs1.add(75.48);
		
		for(Double d:hs1)
		{
			System.out.println(d);
		}
		

	}

}
