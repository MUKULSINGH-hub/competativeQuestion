package Recursion;

public class SearchElement {
	public static boolean checkElement(int [] input, int X, int startIndex) {
		if(startIndex == input.length) {
			return false;
		}
		if (startIndex == X) {
			return true;
		}
		return  checkElement(input,X,startIndex +1);
	}

	public static void main(String[] args) {
		int[]input = {2,4,6,7,8,9,1,4};
		System.out.println(checkElement(input,3,0));

	}

}
