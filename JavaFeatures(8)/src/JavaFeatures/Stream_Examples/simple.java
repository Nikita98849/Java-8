package JavaFeatures.Stream_Examples;
import java.util.List;
import java.util.stream.Stream;

import java.util.Arrays;

public class simple {

	public static void main(String[] args) {
	  List<Integer> arr=Arrays.asList(80,10,40,5,100,29);
	  //Stream<Integer> data=arr.stream();
	  arr.stream().forEach(n->System.out.println(n));
	}

}
