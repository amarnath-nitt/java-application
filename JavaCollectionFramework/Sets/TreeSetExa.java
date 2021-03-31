package JavaCollectionFramework.Sets;


import java.util.*;

public class TreeSetExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ordered Set; Sorted;
        Set<String> st = new TreeSet<>();
        
        st.add("Apple");
        st.add("Mango");
        st.add("Banana"); 
        st.add("Carrot");
        
        System.out.println(st.add("Grapse"));
        System.out.println(st.add("Mango"));
        
        System.out.println(st);
	}

}
