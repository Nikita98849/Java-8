package com.eaxmple;

import java.util.Scanner;

public class chaeckapwerOfTwo {

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		N=sc.nextInt();
		
		int count=0;
		int arr[]=new int[N];
		System.out.println("Enter the No. ");
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int s:arr)
			if(s>0 && (s&(s-1))==0)
				
		System.out.println(s);
//				count++;
//		System.out.println(count);

	}

}
