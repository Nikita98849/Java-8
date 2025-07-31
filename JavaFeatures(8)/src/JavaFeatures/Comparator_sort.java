package JavaFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*public class Comparator_sort implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		
		return b-a;
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(40,20,50,10,30,95);
		Collections.sort(list,new Comparator_sort());
		System.out.println(list);
		
		

	}*/

public class Comparator_sort
{
	public static void main(String arg[])
	{
		List<Integer> list=Arrays.asList(40,30,90,10,20,30);
		Collections.sort(list,(a,b)->b-a);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
}
	


