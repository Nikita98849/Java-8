package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class functionExamples {

    public static void main(String[] args) {
        // 1. Square function
        Function<Integer, Integer> function = x -> x * x;
        System.out.println("Square of 10: " + function.apply(10));

        // 2. List of strings
        List<String> str = Arrays.asList("Nikita", "Aaru", "Aanu", "Devansh", "praju", "Sanskar");

        // 3. Function to get string length
        Function<String, Integer> length = x -> x.length();

        System.out.println("Lengths of each string:");
        for (String s : str) {
            System.out.println(s + ": " + length.apply(s));
        }
 
        //substring() method
        Function<String,String> substring=x->x.substring(0,3);
        for(String s:str)
        {
        	System.out.println(substring.apply(s));
        }
        
        //andThen()
        Function<String,String> str1=s->s.toUpperCase();
        Function<String,String> str2=s->s.substring(0,3);
        
        Function<String,String> s=str1.andThen(str2);
        System.out.println("\n"+s.apply("Nikita"));
        
        //Another example of andThan()
        
        Function<Integer,Integer> res1=x -> 2*x;
        Function<Integer,Integer> res2=x -> x*x*x;
        
        System.out.println(res1.andThen(res2).apply(2));  // 2*2=4,  4*4*4=64
        System.out.println(res2.andThen(res1).apply(2));   // 2*2*2=8,   2*8=16
        
        //compose()
        
        System.out.println(res1.compose(res2).apply(2));  //here the result expectation is 64 but this is 16 because  the compose() method opposite result show in the console 
        
        //identity()
        System.out.println(Function.identity().apply("Hello"));  //identity() method display as it result
        
        
    }
}
