package Collection;

import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args) 
	{
		ArrayList <Integer> al = new ArrayList <Integer> () ;
		al.add (12);
		al.add (19);
		al.add (127);
		al.add (142);
		al.add (19);
		al.add (48);
		al.add (12);
		
		al.set(1, 55);
		
		System.out.println(al);
	}
}


