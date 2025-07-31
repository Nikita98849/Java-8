package Collection_Framework;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Nikita", 7);       //(Nikita->key 7->value)
		map.put("Dhanshree", 8);
		map.put("Rutuja", 2);
		map.put("Pooja", 3);
		map.put("Smarudhi", 4);
		map.put("Vaishnvi", 10);
		map.put("Rutuja",7);
		
		//Collections.sort();           
		System.out.println(map);          //duplicate key is not display 
		System.out.println(map.get("Pooja"));        //3
		
		System.out.println(map.keySet());           //[Dhanshree, Nikita, Smarudhi, Pooja, Vaishnvi, Rutuja]
		System.out.println(map.values());           //[8, 7, 4, 3, 10, 7]
		
		for(String key:map.keySet())
		{
			System.out.println(key+" :"+map.get(key));
		}

	}

}
