package JavaFeatures;

import java.util.Set;
import java.util.TreeSet;

public class treesetExample {

	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<Integer>(); 
	      s.add(20);
	      s.add(10);
	      s.add(5);
	      s.add(90);
	     System.out.println("Before manual sorting :"+s);   //automatically asecending order sorting

	    Set<Integer> s1=new TreeSet<>((a,b)->b-a);
	    s.add(20);
	      s1.add(10);
	      s1.add(5);
	      s1.add(90);
	      s1.add(20);
	      System.out.println("After manual sorting :"+s1);
	}

}
