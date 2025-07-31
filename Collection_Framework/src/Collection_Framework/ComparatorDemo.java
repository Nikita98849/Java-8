package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(43,31,72,29);

		System.out.println(list);                           //[4, 2, 7, 9, 4, 3]
		Collections.sort(list);                             //sorting in ascending order
		list.forEach(a->System.out.println(a));              //[2, 3, 4, 4, 7, 9]
		
		Comparator<Integer> comp=new Comparator<Integer>()
				{
			         public int compare(Integer i,Integer j)
			         {
			        	 if(i%10 > j%10)
			        	 {
			        		 return 0;
			        	 }
			        	 else
			        	 {
			        		 return -1;
			        	 }
			         }
				};
		
		
		Collections.sort(list,comp);
		System.out.println(list);
	}

}
