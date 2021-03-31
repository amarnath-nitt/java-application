package JavaCollectionFramework.ArrayList.GenericType.Methods;

import java.util.LinkedList;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		 List<String> arrStr = new LinkedList<>();
		 
		 List<String> arrVeg = new ArrayList<>();
		 
		 arrStr.add("Apple");
		 arrStr.add("Mango");
		 arrStr.add("Grapse");
		 
		 arrVeg.add("Potato");
		 arrVeg.add("Tomato");
		 arrVeg.add("Carrot");
		 
		 System.out.println("Before addAll: "+ arrStr);
		 arrStr.addAll(arrVeg);
		 
		 System.out.println("After addAll: "+ arrStr);
		 
		 System.out.println(arrStr.get(1));
		 
		 System.out.println("Size of arrStr: "+ arrStr.size());
		 
		 // This is used to replace element at given index;
		 arrStr.set(1, "Banana");

		 System.out.println(arrStr);
		 
		 arrStr.remove(1);
		 
		 System.out.println("Size of arrStr: "+ arrStr.size());
		 System.out.println(arrStr);
		 
		 List<String> toClear = new ArrayList<>();
		 toClear.add("Ram");
		 toClear.add("Shyam");
		 
		 System.out.println( "Before clear: "+ toClear);
		 
		 toClear.clear();
		 
		 System.out.println("After clear: "+toClear);
		 
		 List<String> toRemove = new ArrayList<>();
		 toRemove.add("Apple");
		 toRemove.add("Carrot");
		 
		 System.out.println("Before removeAll: "+ arrStr);
		 arrStr.removeAll(toRemove);
		 
		 System.out.println("After removeAll: "+ arrStr);
		 
		 System.out.println("Is Potato is present in arrStr: "+ arrStr.contains("Potato"));
		 System.out.println("Is Carrot is present in arrStr: "+ arrStr.contains("Carrot"));
	     
		 System.out.println("Is arrStr isEmpty: "+ arrStr.isEmpty());
		 
		 //Object obj = arrStr.toArray();
		 String[] temp = new String[arrStr.size()];
		 arrStr.toArray(temp);
		 System.out.print("Temp array: ");
		 for(String str : temp) {
			 System.out.print(str + " ");
		 }
		 
	
	}

}
