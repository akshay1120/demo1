package Collection;

import java.util.ArrayList;

public class ArrayList_Student 
{
	public static void main(String[] args)
	{
		ArrayList<Student> al = new ArrayList<>();
		
		Student s1 = new Student("Akshay" , 11);
		Student s2 = new Student("Akshay" , 21);
		Student s3 = new Student("Nilesh" , 75);
		Student s4 = new Student("Rajesh" , 45);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println(al);
	}
}
