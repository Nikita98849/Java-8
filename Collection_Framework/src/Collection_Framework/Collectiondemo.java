package Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo {


	public static void main(String[] args) {
	      Collection co=new ArrayList();
	      co.add(6);
	      co.add(5);
	      co.add(8);
	      co.add(2);
	      System.out.println(co);     //[6,5,8,2]
//	      for(int i:co)     // cannot convert from element type Object to int
//	      {
//	    	  System.out.println(i);
//	      }
	     System.out.println(((ArrayList) co). get(0)); 
	     
	  //Using <Integer>
	     Collection<Integer> num=new ArrayList<>();
	      num.add(6);
	      num.add(5);
	      num.add(8);
	      num.add(2);
	      System.out.println(num);
	      System.out.println(ArrayList.class);
	      for(int i:num)
	      {
	    	  System.out.print(i);
	    	 
	      }
	      System.out.println();
	    
	   //Using Object return type
	      
	      Collection s=new ArrayList();
	      s.add(6);
	      s.add(5);
	      s.add(8);
	      s.add(2);
	      
	      for(Object i:s)
	      {
	    	  System.out.println((Integer)i*2);
	    	  
	      }
	}

}
