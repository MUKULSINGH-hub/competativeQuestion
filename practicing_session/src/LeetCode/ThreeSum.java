package LeetCode;
import java.util.*;

public class ThreeSum {
	public static void threesum(int[]arr){
		boolean found = false;
		for(int i = 0;i<arr.length-2;i++) {
			for(int j = i+1; j<arr.length-1;j++) {
				for(int k = j +1; k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						System.out.println(arr[i]);
						System.out.print("  ");
						System.out.println(arr[j]);
						System.out.print(" ");
						System.out.println(arr[k]);
						System.out.print(" ");
						found = true;
					}
				}
			}
		}
		if(found  ==false) {
			System.out.println("not exist");
		}
		
	}

	public static void main(String[] args) {
		int[]arr = {0,-1,2,-3,-1};
		threesum(arr);
		
		

	}

}
