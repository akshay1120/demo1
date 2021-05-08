package Collection;

import java.util.Vector;

public class vector_1 
{
	public static void main(String[] args)
	{
		Vector<Integer> vr = new Vector<>();
		
		vr.add(23);
		vr.add(33);
		vr.add(43);
		vr.add(53);
		vr.add(23);
		vr.add(33);
		 
		System.out.println("Vector size = "+vr.size());
		System.out.println("Vector capacity = "+vr.capacity());

		vr.add(43);
		vr.add(53);
		vr.add(23);
		vr.add(33);
		vr.add(43);
		vr.add(53);
		
		System.out.println("Vector size = "+vr.size());
		System.out.println("Vector capacity = "+vr.capacity());
	}
}
