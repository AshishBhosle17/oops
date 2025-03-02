package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		// insert
		hashmap.put(1, "BJP");
		hashmap.put(2, "INC");
		hashmap.put(3, "NCP");
		hashmap.put(4, "SS");
		
		System.out.println(hashmap);
		
		// update
		hashmap.put(4, "SSUBT");
		System.out.println("Updated: "+ hashmap);
		
		// delete
		hashmap.remove(1);
		System.out.println("Deleted: " + hashmap);
		
		// read
		Set<?> set = hashmap.entrySet();
		Iterator<?> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
