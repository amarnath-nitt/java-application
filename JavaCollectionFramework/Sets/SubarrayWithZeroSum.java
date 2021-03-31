package JavaCollectionFramework.Sets;

/** 
 * Given an array of size n in which you have to find, is there any subarray exist whose is zero;
 * 
 * **/
import java.util.*;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		int [] arr = {2,1,3,-4,-2};
		boolean found = false;
		
		Set<Integer> st = new HashSet<>();
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(st.contains(sum) || sum==0) {
				found = true;
			}
			
			st.add(sum);
			if(found) {
				break;
			}
		}
		if(found) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}

}
