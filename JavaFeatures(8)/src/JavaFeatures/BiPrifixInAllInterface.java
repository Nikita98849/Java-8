package JavaFeatures;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPrifixInAllInterface {

	public static void main(String[] args) {
		
		//BiPredicate()
		BiPredicate<Integer,Integer> predicate=(x,y)->x%2==0 && y%2==0;
		System.out.println(predicate.test(4, 2));
		
		BiPredicate<String,Integer> obj=(str,i)->str.length()==i;
		System.out.println(obj.test("Nikita", 06));    //true
		
		//BiFunction()
		BiFunction<String,String,Integer> obj1=(str1,str2)->str1.length()+str2.length();
		System.out.println("Sum Of two string length :"+obj1.apply("Nikita","aaradhya"));    //6+8=14
		
		//BiConsumer()
		BiConsumer<Integer,Integer> obj2=(x,y)->{System.out.println(x+y);};
		obj2.accept(90,10);
		
		
		
		
		
	}

}
