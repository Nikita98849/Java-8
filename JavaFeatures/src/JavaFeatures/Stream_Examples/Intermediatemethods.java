package JavaFeatures.Stream_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediatemethods {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(90,10,30,60,48,30);
		//sorted()
		//arr.stream().sorted().forEach(System.out::println);
		
		//filter()
		//arr.stream().sorted().filter(n->n==0).forEach(System.out::println);
		
		//map()
		//arr.stream().sorted().filter(n->n%2==0).map(n->n-10).forEach(System.out::println);
		
		//distinct()
		//arr.stream().sorted().distinct().filter(n->n%2==0).map(n->n-10).forEach(System.out::println);
		
		//flatMap()
		List<String> str =Arrays.asList("aa","bc","cd");
		//str.stream().sorted().flatMap(a->Stream.of(a.charAt(1))).forEach(System.out::println);
		
		//peek()
		//arr.stream().peek(System.out::println).findFirst().get();
		
		//limit()
		//arr.stream().limit(3).forEach(System.out::println);
		
		//skip()
		arr.stream().skip(2).forEach(System.out::println);
		
	}

}
