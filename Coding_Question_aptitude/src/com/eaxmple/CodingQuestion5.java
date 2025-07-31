package com.eaxmple;
import java.util.Scanner;

public class CodingQuestion5 {

	public static void main(String[] args) {
		int w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight :");
		w=sc.nextInt();
		System.out.println("The Weight : ");
		System.out.println(w==0?"0":w<=2000 && w>0 ? "25" : w<=4000 && w>2000 ? "35" : w<=7000 && w>4000 ? "45" : "Not Valid");

	}

}
