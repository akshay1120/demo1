package Collection;

import java.util.ArrayList;

public class ArrayList_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> Al = new ArrayList<>() ;
		
		ArrayList<Integer> al1 = new ArrayList <>() ;
		al1.add(11);
		al1.add(22);
		al1.add(33);
		
		ArrayList<Integer> al2 = new ArrayList <>() ;
		al2.add(13);
		al2.add(26);
		al2.add(39);
		
		Al.add(al1);
		Al.add(al2);
		
		System.out.println(Al);
		
		for (ArrayList<Integer> VAL : Al)
		{
			System.out.println(VAL);
			
			for( int val : VAL )
			{
				System.out.println(val);
			}
		}
	}
}
