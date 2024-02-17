package collections.sets;

import java.util.*;

public class HashSetExa {

	public static void main(String[] args) {
		
        // Unordered Set means in Random order;
        Set<String> st = new HashSet<>();
        
        st.add("Apple");
        st.add("Mango");
        st.add("Banana"); 
        st.add("Carrot");
        
        System.out.println(st.add("Grapse"));
        System.out.println(st.add("Mango"));
        
        System.out.println(st);
        
        
	}

}
