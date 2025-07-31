package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparabledemo {

	static class Student implements Comparable<Student>
	{
		int age;
		String name;
		
		public Student(int age,String name)
		{
			this.age=age;
			this.name=name;		
			
		}
		public String toString()
		{
			return "Student[age ="+age+", Name ="+name+"]";
		}
		
		public int compareTo(Student that)
		{
			if(this.age>that.age)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		
	}
	public static void main(String[] args) {
		 List<Student> list = new ArrayList<>();
		list.add(new Student(19, "Nikita"));
        list.add(new Student(18, "Dhanshree"));
        list.add(new Student(20, "Rutuja"));
        list.add(new Student(21, "Pooja"));
		Collections.sort(list);
		for(Student s:list)
		   System.out.println(s);
		

	}
	
}
