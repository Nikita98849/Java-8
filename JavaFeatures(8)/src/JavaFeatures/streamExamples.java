package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamExamples {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,35,90,230,0,1,2,3,0,5,80);
		List<Integer> collect = asList.stream().filter(x->x%2==0).map(x->x/10).sorted((a,b)->a-b).distinct().limit(3).collect(Collectors.toList());   
		System.out.println(collect); 
		
		//filter()->[90,230,0,2,0,80]
		//map()->[9,23,0,0,0,8]
		//sorted()->[0,0,0,8,9,23]
		//distinct()->[0,8,9,23]
		//limit(3)->[0,8,9]
		//limit(1)->[0,8]
		
		List<Integer> li=Stream.iterate(0,x->x+1).limit(100).skip(1).filter(x->x%2==0)
				.map(x->x/10).distinct().sorted((a,b)->b-a).peek(x->System.out.print(x))
				.toList();
		 
		System.out.println(li);
	                                                                                                                              
		          //skip(1)->First index is deleted
		          //filter(x->x%2==0)->divisible by 2(check condition)
		          //map(x->x/10)->divisible by 10(perform execution)
		          //distinct()->duplicate value is deleted
		          //sorting((a,b)->b-a)->sorting in descending order
		          //peek()->declare sorting all data
		
		
		//parallelStream
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> parallelStream = l.parallelStream();
		parallelStream.forEach(System.out::println);
		
		
		          
                                                                
	}

}
