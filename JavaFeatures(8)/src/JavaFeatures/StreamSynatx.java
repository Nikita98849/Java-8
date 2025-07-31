package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSynatx {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Banana ","Apple ","chrerry\n");
		Stream<String> stream = list.stream();
		stream.forEach(System.out::print);
		
		int[] array= {1,2,3,4,5};
		IntStream stream2 = Arrays.stream(array);
		stream2.forEach(System.out::print);
		
		Stream<Integer> i=Stream.of(1,2,3,3,4);
		i.forEach(x->System.out.print("\n"+x+" "));
		
		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);
		limit.forEach(x->System.out.println(" "+x));
		
		Stream<String> limit2 = Stream.generate(()->"hello").limit(5);
		limit2.forEach(x->System.out.println(x));
		
		Stream<Integer> limit3=Stream.generate(()->(int)Math.random()*10).limit(5);
		limit3.forEach(System.out::println);
		
		List<String> list4=Arrays.asList("Banana ","Apple ","chrerry\n");
		List<String> collect = list4.stream().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}

}
