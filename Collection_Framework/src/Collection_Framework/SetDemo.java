package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(15);
		s.add(20);
		s.add(12);
		s.add(10);
		System.out.println(s);          //duplicate values are deleted  
		                                // randomly values are display do not sorting data    [20, 10, 12, 15]
		
		Set<Integer> s1=new TreeSet<>();
		s1.add(10);
		s1.add(15);
		s1.add(20);
		s1.add(12);
		s1.add(10);
		System.out.println(s1);          //automatically sorting data in ascending order [10,12,15,20]
		
		
		

	}

}
