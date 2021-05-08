package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_ArrayList 
{
	public static void main(String[] args) 
	{
		HashMap <String,ArrayList<String>> hm = new HashMap<>();
		
		ArrayList <String> allist = new ArrayList<>() ;
		allist.add("MH");
		allist.add("UP");
		allist.add("RJ");
		
		hm.put("India", allist );
		
		ArrayList <String> allist_1 = new ArrayList<>() ;
		allist_1.add("California");
		allist_1.add("Florida");
		allist_1.add("New_York");
		
		hm.put("U.S.A", allist_1);
		
		System.out.println(hm);
		
		Set <String> keys = hm.keySet() ;
		
		for(String key : keys)
		{
			System.out.println(key);
			
			ArrayList<String> values = hm.get(key);
			
			for(String val : values)
			{
				System.out.println(val);
			}
			
		}
	}
}
