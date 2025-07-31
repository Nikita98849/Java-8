package JavaFeatures;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SolveExample {

	public static void main(String[] args)
	{
	    int N;
	    System.out.println("Enter Balloon No :");
	    Scanner sc=new Scanner(System.in);
	    N=sc.nextInt();
	    char arr[]=new char[N];
	    
	    System.out.println("Enter Balloon Color :");
	    List<Character> balloons = new ArrayList<>();
	    for (int i = 0; i < N; i++) {
            char ch = Character.toLowerCase(sc.nextLine().charAt(0));
            balloons.add(ch);
        }
	    
	    Map<Character, Long> freqMap = balloons.stream()
	            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
	    
	    Optional<Character> result = freqMap.entrySet().stream()
	            .filter(entry -> entry.getValue() % 2 != 0)
	            .map(Map.Entry::getKey)
	            .findFirst();

	        
	        if (result.isPresent()) {
	            System.out.println(result.get());
	        } else {
	            System.out.println("All are even");
	        }
	    }
	}