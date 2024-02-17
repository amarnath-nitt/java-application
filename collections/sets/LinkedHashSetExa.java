package collections.sets;

import java.util.*;

public class LinkedHashSetExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Sequencial Order Set;
        Set<String> st = new LinkedHashSet<>();
        
        st.add("Apple");
        st.add("Mango");
        st.add("Banana"); 
        st.add("Carrot");
        
        System.out.println(st.add("Grapse"));
        System.out.println(st.add("Mango"));
        
        System.out.println(st);
	}

}
