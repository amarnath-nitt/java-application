package JavaCollectionFramework.LinkedList.LinkedListCollection;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new LinkedList<>();
        List<Integer> arrList = new ArrayList<>();
        
        getTimeDiff(list);
        getTimeDiff(arrList);
	}
	public static void getTimeDiff(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " --> " + (end-start));
	}

}
