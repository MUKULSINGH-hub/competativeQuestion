package Recursion;

public class AddArrayElement {
	public static int addArray(int[]input , int startIndex) {
		if(startIndex==input.length) {
			return 0;
		}
		return input[startIndex] + addArray(input,startIndex + 1);
		
	}

	public static void main(String[] args) {
	 	int [] input = {2,4,5,7,8,1,9};
	 	System.out.println(addArray(input,0));

	}

}
