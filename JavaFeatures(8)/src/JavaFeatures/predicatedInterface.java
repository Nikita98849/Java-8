package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class predicatedInterface {

	public static void main(String[] args) {
		
		 Predicate<Integer> predicate=x-> x > 1000;
		System.out.println(predicate.test(100000));       //true
		
		int sal=90;
		System.out.println((predicate.test(sal)));
		
		
		List<Integer> list=Arrays.asList(10,40,5,80,205,30);
		int sum=list.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum);
		
		
		//below code is very complicate so, this code is overcome and use lambda expression in above code 
		int sum1=0;
		for(int no:list)
		{
			if(no%2==0)
			    sum1+=no;
		}
		System.out.println(sum+"\n");
		
		
	//.........................//
		
		Predicate<Integer> p=x->x%2==0;
		List<Integer> li=Arrays.asList(10,2,5,30,50,25);
		for(int i :li)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
			
		}
		
	//.........................//
	     Predicate<String> s=x-> x.charAt(0)=='v';
		System.out.println(s.test("Nikita"));            //firstLetter check
		
		
		Predicate<String> s1=x->x.toLowerCase().charAt(x.length()-1)=='a';
		
//		and()
		       Predicate<String> and = s1.and(s); //Nikita = First letter:N  & last letter:a  so,and condition false
		       System.out.println(and.test("Nikita"));
		       
//		or()
		       Predicate<String> or=s1.or(s);
		       System.out.println(or.test("Nikita"));   //true beacuse at list one condition is true
		       
//		 negate()
		       System.out.println(s.negate().test("Nikita"));   //true because this condition is false
		       
//		  isEqual()
		       System.out.println(Predicate.isEqual("Nikita").test("Aaru"));        //true
		       
		       	       
		
		
	}

}
