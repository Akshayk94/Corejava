package maps;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo2 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> hmap=new LinkedHashMap<Integer,String>();
		hmap.put(123, "DELHI");
		hmap.put(223, "BANGLORE");
		hmap.put(523, "PUNE");
		hmap.put(444, "MUMBAI");
		hmap.put(333, "CHENNAI");
		
		
		Set s=hmap.entrySet();//representing hashmap as a set
		
		Iterator itr=s.iterator(); //start iterations
		
		while(itr.hasNext())
		{
			Map.Entry mentry=(Entry) itr.next();
			
			System.out.println("KEY :"+mentry.getKey()+"=VALUE: "+mentry.getValue());
		}
	}
}
