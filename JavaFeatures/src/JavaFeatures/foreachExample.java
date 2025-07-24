package JavaFeatures;
import java.util.Arrays;
import java.util.List;

public class foreachExample {

	public static void main(String[] args) {
		
		//Java 8
		
		List<Integer> arrays=Arrays.asList(10,30,20,50);
		
		//External Loop
		
		System.out.println("Using for loop :");
		for(int i=0;i<arrays.size();i++)
		{
			//System.out.println(i);   print index ->0 1 2 3
			
			System.out.println(arrays.get(i));      //print values -> 10 30 20 50
		}
		
		System.out.println("Using foreach loop :");
		for(int aar:arrays)
		{
			System.out.println(aar);
		}
		
		//Internal loop
		System.out.println("Using foreach(java 8) loop :");
		arrays.forEach(i->System.out.println(i));  //lambda  //consumer
		

	}

}
