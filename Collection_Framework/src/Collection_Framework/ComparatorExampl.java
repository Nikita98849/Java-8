package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Student
	{  int age;
       String name;
	  public Student(int age,String name) 
	    {
		     this.age=age;
		     this.name=name;
	    }
	    public String toString()
	    {
	    	return "Student[age="+age+",name="+name+"]";
	    }
		
	}
 
public class ComparatorExampl {

	public static void main(String[] args) {
		
		Comparator<Student> comp=(Student i,Student j)->{return (i.age>j.age)?1:-1;};
			          
	List<Student> list=new ArrayList<Student>();
	list.add(new Student(19,"Nikita"));
	list.add(new Student(18,"Dhanshree"));
	list.add(new Student(20,"Rutuja"));
	list.add(new Student(21,"Pooja"));
	
	Collections.sort(list,comp);
	for(Student s:list)
	   System.out.println(s);
	

	}

}
