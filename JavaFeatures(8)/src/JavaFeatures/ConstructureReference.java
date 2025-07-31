package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructureReference {
	
	public static class Student
	{
		private String name;

		public Student(String x)
		{
			this.name=x;
		}
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String toString()
		{
			return "Student{name='" + name + "'}";
		}
	}

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Nikita","Dhanshree","Pooja","Rutuja");
		List<Student> collects = str.stream().map(x->new Student(x)).collect(Collectors.toList());
		collects.forEach(System.out::println);
		
		
	}

}
