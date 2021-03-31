package JavaCollectionFramework.Sets;

/** 
 * Given an array of size n in which you have to find, is there any subarray exist whose is K;
 * 
 * **/
import java.util.*;

public class SubarrayWithSumEqualToK {

	public static void main(String[] args) {
		 
		int [] arr = { 2, 1, 3, 4, 2, -4, -1, 0, 1, 4, 5};
		int k = 50;
		
		Set<Integer> st = new HashSet<>();
		int sum=0;
		boolean found=false;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
			
			if(st.contains(sum-k) || sum==k) {
				found=true;
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
