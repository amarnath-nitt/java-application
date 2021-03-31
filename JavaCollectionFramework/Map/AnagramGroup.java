package JavaCollectionFramework.Map;

import java.util.*;
public class AnagramGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] strs = {"got", "dog", "cat", "act", "tac", "tog", "fog"};
        List<List<String>> result = new LinkedList<>();
        Solution sol = new Solution();
        result = sol.groupAnagrams(strs);
        System.out.println(result);
	}

}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        for(String str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);
            
            if(!myMap.containsKey(sorted)){
                myMap.put(sorted, new LinkedList<>());
            }
            myMap.get(sorted).add(str);
        }
        return new LinkedList<>(myMap.values());
    }
}
