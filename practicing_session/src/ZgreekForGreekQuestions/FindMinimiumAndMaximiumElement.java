package ZgreekForGreekQuestions;

public class FindMinimiumAndMaximiumElement {
	public static void findminandmax( int[] arr) {
		int n = arr.length;
		int MIN = arr[0];
		int MAX = arr[0];
		for( int i = 1; i < arr.length; i ++) {
			if (arr[i]< arr[0]) {
				MIN = arr[i];
			}
		}
		System.out.println("The minimium element is "+MIN);
		for (int j = 1; j< n; j++) {
			if(arr[j]>arr[0]) {
				MAX = arr[j];
			}
		}
		System.out.println("The maximium element is "+MAX);
		
		
		
	}

	public static void main(String[] args) {
	int []arr = {2,4,5,6,7,8,9,1};
	findminandmax(arr);
	

	}

}
