package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class CounsumerExample {

	public static void main(String[] args) {

    List<Integer> arrays=Arrays.asList(10,20,39,430,90);
//    Consumer<Integer> c=i->System.out.println(i);
    arrays.forEach(i->System.out.println(i));

	}

}
