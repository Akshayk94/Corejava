package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(123, "DELHI");
		hmap.put(223, "BANGLORE");
		hmap.put(333, "PUNE");
		hmap.put(444, "MUMBAI");
		hmap.put(523, "CHENNAI");
		
		
		Set s=hmap.entrySet();//representing hashmap as a set
		
		Iterator itr=s.iterator(); //start iterations
		
		while(itr.hasNext())
		{
			Map.Entry mentry=(Entry) itr.next();
			
			System.out.println("KEY :"+mentry.getKey()+"=VALUE: "+mentry.getValue());
		}

	}

}
