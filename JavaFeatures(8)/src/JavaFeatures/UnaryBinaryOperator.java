package JavaFeatures;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator 
{
   public static void main(String arg[])
	{
	   
		Function<Integer,Integer> s= x -> x*x;
		System.out.println("Using Function Interface :"+s.apply(5));
		
		//Unary Operator
		UnaryOperator<Integer> no= i->i*i;  //if return and declare variable datatype same then use UnaryOperatpor
		System.out.println("Using UnaryOperator :"+no.apply(2));
		
		
		BiFunction<String,String,String> bifunction=(x,y)->x+y; 
		System.out.println("using BiFunction Interface :"+bifunction.apply("Hello ","World"));
		
		//BinaryOperator
		BinaryOperator<String> binaryoperator=(i,j)->i+j;
		System.out.println("Using BinaryOperator :"+binaryoperator.apply("Hello ", "World"));
		
		
		
	    
	}
   
}
