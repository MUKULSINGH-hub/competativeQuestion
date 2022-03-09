package binarySearch;

public class BinarySearch {
	public static int  binarysearch(int[] input, int element) {
		int start = 0;
		int end = input.length -1;
		while(start <= end ) {
			int mid =  (start + end) /2;
			if(element == input[mid]) {
				// if element will found at mid we will return the mid;
				return mid;
			}else if(element > input[mid]) {
				//if element is greater then input[mid] then start will change and  make one step forward of mid
				start = mid + 1;
			}else  {
				// if elemets is smaller than input[id] then end will chnage and the will make n-1
				end = mid -1;
				
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  input = {2,3,4,5,6,7,8};
		int index = binarysearch(input ,2);
		System.out.println( "we found your array in==="+index);
		

	}

}
