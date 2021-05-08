package Collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest 
{
	public static void main(String[] args) 
	{
		HashMap <Integer, String> hm = new HashMap<>();
		hm.put (23 , "india1");
		hm.put (11 , "india2");                                  
		hm.put (14 , "india3");                                     
		hm.put (12 , "india4");
		hm.put (78 , "india5");
		hm.put (23 , "india6");
		hm.put (11 , "india7");
		hm.put (23 , "india8");
		hm.put (11 , "india9");
		System.out.println(hm.size());
		System.out.println(hm);
		
		Set <Integer> keys = hm.keySet();
		System.out.println("keys = " + keys);
		
		for(int i : keys)
		{
			System.out.println(i);
			
			String val = hm.get(i);
			System.out.println("value = " + val);
		}
	}
}


