package collections.map;

import java.util.*;
import java.util.Map.*;
public class HashMapExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Unordered Map;
        Map<String, Integer>myMap = new HashMap<>();
        
        myMap.put("foure", 4);
        myMap.put("five", 5);
        myMap.put("one", 1);
        myMap.put("tow", 2);
        myMap.put("three", 3);
        
        myMap.putIfAbsent("one",10);
        myMap.putIfAbsent("ten", 10);
        System.out.println(myMap);
        
        System.out.println(myMap.get("one"));
        
        myMap.remove("tow");
        
        System.out.println(myMap.containsValue(10));
        System.out.println(myMap.containsKey("tow"));
        
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        
        System.out.println(myMap.entrySet());
        System.out.println(myMap);
        
        Set<Entry<String, Integer>> entries = myMap.entrySet();
        
        for(Entry<String, Integer> ele : entries) {
        	ele.setValue(ele.getValue()*100);
        }
        
        System.out.println(myMap);
        
	}

}
