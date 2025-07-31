package Collection_Framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		Set<Integer> co=new TreeSet<>();
		co.add(10);
		co.add(15);
		co.add(20);
		co.add(12);
		co.add(10);
		System.out.println(co);
		
		Iterator<Integer> iterate=co.iterator();
     //System.out.println(iterate.next());    //only first element is displayed
		
		//if all elements are displayd so we can use hasNext() method Using while loop
		
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());		}

	}

}
