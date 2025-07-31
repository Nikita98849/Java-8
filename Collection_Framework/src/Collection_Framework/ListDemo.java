package Collection_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,5,7,15,1,2,0,1,5,20);
		System.out.println(list);
		System.out.println(list.get(3));      //index()3=>1
		System.out.println(list.indexOf(1));   //index(1)->3	    //duplicate values are displayed	

	}

}
