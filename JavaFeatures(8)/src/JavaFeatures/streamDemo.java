package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamDemo {

	public static void main(String[] args) {

  List<Integer> arr=Arrays.asList(1,2,23,34,90,2,12);
  Stream<Integer> s=arr.stream();
  s.forEach(System.out::println);   //will work
  s.forEach(System.out::println);    //exception
  

	}

}
