package com.eaxmple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CodingTest2Example {
	public static void main(String[] args) {

       Random r=new Random();
       int no=r.nextInt((90)+10);
       Set<Integer> s=new HashSet<>();
       while(s.size()<11)
       { 
    	   int n=r.nextInt((9000)+1000);  
           s.add(n);          
       }
       System.out.println("Four digit numbers :"+s);
       System.out.println("Two digit number :"+no);
//       List<Integer> list=new ArrayList();
//       list.addAll(s);
       s.toArray();
       List<Integer> l=s.stream().map(i->no*i).sorted().toList();
      
        System.out.println(l);
        System.out.println("First Winner :"+l.get(l.size()/2)+"\n Second Winner :"+l.get(l.size()/2-1)+
        		"\nThird Winner :"+l.get(l.size()/2+1));
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

      
      
       
       
       
              
          
       
	}

}
