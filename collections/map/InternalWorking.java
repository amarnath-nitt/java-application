package collections.map;

import java.util.*;

public class InternalWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> arrList = new ArrayList<>();
       arrList.add("CAT"); arrList.add("DOG");
       arrList.add("ACT"); arrList.add("GOD");
       arrList.add("PUT"); arrList.add("BUT");
       
       for(String str: arrList) {
    	   System.out.println("Hash code of "+ str + " : "+ getHash(str));
       }
       
	}
    
	public static int getHash(String str) {
		int hash=0;
		for(int i=0; i<str.length(); i++) {
			hash += str.charAt(i);
		}
		return hash;
	}

}
