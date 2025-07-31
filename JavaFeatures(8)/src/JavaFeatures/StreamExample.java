package JavaFeatures;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> array=new ArrayList<>();
		for(int i=0;i<=100;i++) {
			array.add(i);
		}
//		for(int i:array)          //using for loop
//		{
//			System.out.println(i);
//		}

//		array.forEach(System.out::println);     //using forEach loop
		
//		array.stream().forEach(System.out::println);     //using stream->convert normal list into a stream
		
//		array.parallelStream().forEach(System.out::println); //using parallelStream
		
		array.stream().filter(i->{
			System.out.println("hi");
			return true;
		  
		}).findFirst().orElse(0);
		 
	}

}
