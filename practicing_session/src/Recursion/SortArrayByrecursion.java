package Recursion;

public class SortArrayByrecursion {
	public static boolean checksort(int[] input) {
		if(input.length <= 1) {
			return true;
		}
		int smallInput[]=  new int[input.length-1];
		for(int i = 1; i<input.length;i++) {
			smallInput[i-1]= input[i];
		}
		boolean smallans =  checksort(smallInput);
		System.out.println("jsadhgh");
		if(!smallans) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
	
		
	}

	public static void main(String[] args) {
	int[]sort = {1,2,3,4,5,6,7,8,9};
	System.out.println(checksort(sort));

	}

}
