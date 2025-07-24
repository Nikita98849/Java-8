package JavaFeatures.Stream_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class terminalmethods {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(9,1,1,3,8,2,10);
		
		//toArray()
		Object[] array = arr.stream().toArray();
		
	   System.out.println(array.length-1+" "+array[3]);    //6 3
	   
	   //count();
	   System.out.println(arr.stream().sorted().count());  //7
	   
	   //collect()
	   System.out.println(arr.stream().collect(Collectors.toSet()));   //[1,2,3,8,9,10]	 
	   
	   //reduce()
	   System.out.println(arr.stream().reduce(0,(a,b)->a+b));    //34
	   
	   
	   //forEach()
	   arr.stream().forEach(System.out::print);
	   System.out.println();
	   
	   //forEachOrdered()
	   arr.stream().forEachOrdered(System.out::print);
	   
	   //min()
	   System.out.println(" \n"+arr.stream().min((a,b)->a-b).get());
	   
	   //max()
	   System.out.println(arr.stream().max((a,b)->a-b).get());
	   
	   //anyMatch(),allMatch(),noneMatch(),findAny()
	   System.out.println(arr.stream().anyMatch(a->a==2));
	   System.out.println(arr.stream().allMatch(a->a/1==a));
	   System.out.println(arr.stream().noneMatch(a->a==2));
	   System.out.println(arr.stream().findAny().get());
	   
	   

	}

}
