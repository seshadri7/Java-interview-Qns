package programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	
	

	public static void main(String[] args) {
		
		HashMap<String,String> du = new HashMap<String,String>();
		
		du.put("v", "sesh");
		du.put("", "Sachin");
		du.put("A", "Adi");
		du.put("B", "Adi");
		
		System.out.println(du);
		
		//Display content using iterator
		
	/*	Set set=du.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			
			System.out.println(entry.getKey()+" "+":"+" "+entry.getValue());
			
		}*/
		
		
		// Display content using for each loop  with key set
		
		Set<String> keyset = du.keySet();
		
		for(String i: keyset) {
			System.out.println(i+" "+":"+" "+du.get(i));
		}
		
		
		
		// Display content with using entry set
		
		
		Set<Entry<String, String>> entryset2 = du.entrySet();
		
		for(Entry<String, String> e : entryset2) {
			
			System.out.println(e.getValue() +" "+": "+" "+e.getKey());
		}
		
		
		
	
		
		
	

	
	}

}
