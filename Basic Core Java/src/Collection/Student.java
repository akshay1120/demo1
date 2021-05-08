package Collection;

public class Student
{
		String name ;
		int age;
		
		public Student(String name, int age) 
		{
			super();
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return " [name=" + name + ", age=" + age + "]";
		}
		
		
}
