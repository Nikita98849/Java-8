package JavaFeatures;

import java.util.Map;
import java.util.TreeMap;

public class mapExample {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap();
		m.put(1, "Nikita");
		m.put(0, "Dhanu");
		m.put(2, "Aaru");
		System.out.println(m);
		
		Map<Integer,String> m1=new TreeMap<>((a,b)->b-a);
		m1.put(1, "Nikita");
		m1.put(0, "Dhanu");
		m1.put(2, "Aaru");
		System.out.println(m1);
		
	}

}
