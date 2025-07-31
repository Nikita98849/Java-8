package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		//only use (no return any value),it us used to display the result
		
		Consumer<String> str=s->System.out.println(s);        //Consumer =accept()   //only display 
		str.accept("Nikita Yadav");                           //Function = apply()   //perform operation
		                                                      //Predicate =test()  //only check
		Consumer<List<Integer>> list=s->                      //Supplier  =get() //only return 
		{
			for(int i:s)
			{
				System.out.println(i+100);
			}
		};
		//list.accept(Arrays.asList(50,20,5,10,12));
 		
		Consumer<List<Integer>> list1=li->
		{
			for(int i:li)
			{
				System.out.println(i);
			}
		};
	     list1.andThen(list).accept(Arrays.asList(1,2,3,4,5));
		
	}

}
