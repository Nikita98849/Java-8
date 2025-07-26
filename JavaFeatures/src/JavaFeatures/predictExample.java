package JavaFeatures;

import java.util.function.Predicate;

class Student
{
	String name;
	int id;
	
	
	public Student(String string, int i) {
		name=string;
		id=i;
		
	}
	public String getName()
	{
		return name; 
	}
	public int getId()
	{
		return id;
	}
}
 public class predictExample {

	public static void main(String[] args) {
		Student s1=new Student("Nikita",1);
		Student s2=new Student("Aaru",2);
		Predicate<Student> stud=x->x.getId()>1;
		System.out.println(stud.test(s2));
		
		
		
		

	}

}

 
