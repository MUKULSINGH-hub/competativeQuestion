package StackProblem;

public class BubbleSort {
	public static void bubblesort(int[]input) {
		for(int i = 0 ;i<input.length-1; i ++) {
			for(int j = 0; j <input.length-1;j++) {
				if(input[j]> input[j+1]) {
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}	
			}
		}	
	}
	public static void main(String[] args) {
		int []input = {4,6,8,1,9,2};
		bubblesort(input);
		for(int i = 0;i < input.length;i++) {
			System.out.print(input[i]);
		}
	}

}
