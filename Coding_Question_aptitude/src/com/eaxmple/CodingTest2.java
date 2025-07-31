package com.eaxmple;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CodingTest2 {

	public static void main(String[] args) {
		
	 Set<Integer>a=new TreeSet<Integer>();
		while(a.size()<=10)
		{
	       Random r=new Random();
		   a.add(r.nextInt((9000)+1000));
		   	
	   }
		Random r1=new Random();
		int num=r1.nextInt(90)+10;
		
		Integer arr[]=new Integer[a.size()]; 
          a.toArray(arr);
          List<Integer> list=new ArrayList();
          for(int i=0;i<arr.length;i++)
          {
        	  int b=num*arr[i];
        	  list.add(b);
          }
          System.out.println(list);
		 
		 System.out.println(list.get(list.size()/2)-1);
		 System.out.println(list.get(list.size()/2)+1);
		 
		
		
	}

	
}
