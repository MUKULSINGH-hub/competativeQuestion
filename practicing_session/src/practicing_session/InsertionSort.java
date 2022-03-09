package practicing_session;

public class InsertionSort {
	public static void InsertionSort(int[] input) {
		for(int i = 1; i<input.length; i++) {
			int j = i -1;
			int temp = input[i];
			while(j>=0 && input[j]> temp) {
				input[j+1]= input[j];
				j--;
			}
			input[j+1]= temp;
		}
	}

	public static void main(String[] args) {
		int[] input = {3,7,8,1,4,0,3,4};
		InsertionSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
