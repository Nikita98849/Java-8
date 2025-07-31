package JavaFeatures;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void disp(String str)
	{
		System.out.println(str);
	}
	public  void disp1(String str)
	{
		System.out.println(str);
	}

	public static Integer hello()
	{
		return 1;
	}

	public static void main(String[] args) {
		MethodReference obj=new MethodReference(); 
		List<String> list=Arrays.asList("alice","Bob","Charlie");
		System.out.println("With static method :");
		list.forEach(MethodReference::disp);               //method reference
		System.out.println("\nWithout Static method :");
		list.forEach(obj::disp1);
		
		System.out.println(hello());   //invoke hello() method
		
		
		

	}

}
