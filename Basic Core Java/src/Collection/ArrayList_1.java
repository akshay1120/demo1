package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>() ;
		
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(13);
		al.add(26);
		al.add(39);
		
		Collections.sort(al);
		Collections.reverse(al);
		
		System.out.println(al);
		
		for (int i : al)
		{
			System.out.println(i);
		}
	}
}
