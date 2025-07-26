package JavaFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectCollectionComparator {

	public static void main(String[] args) {
		Student s1=new Student(1,"Nikita");
		Student s2=new Student(0,"Dhanu");
		Student s3=new Student(2,"Aaru");
		
		List<Student> li=new ArrayList<Student>();	
		li.add(s1);
		li.add(s3);
		li.add(s2);
		Collections.sort(li,(a,b)->a.id-b.id);
		System.out.println(li);
	

	}
	static class Student
	{
		public String name;
		public int id;
		public Student(int is,String name)
		{
			this.name=name;
			this.id=id;
			
		}
		public String toString()
		{
			return this.id+": "+this.name;
	    }
	}

}
