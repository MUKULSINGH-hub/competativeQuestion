package StackProblem;

public class SelectionSort {
	public static void SortingArray(int[]input ) {
		for(int i = 0 ; i < input.length- 1; i ++) {
			int minimium = input[i];
			int minimiumIndex = i;
			for( int j = i + 1; j < input.length; j ++) {
				if (input[j] < minimium) {  // minimium = input[i]
					// if minimium index is found at any index
					
					minimium = input[j];
					minimiumIndex = j;
				}
			}
			if(minimiumIndex != i) {
			input[minimiumIndex] = input[i];
			input[i]= minimium;	
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []input = {2,6,9,1,5 }	;
	SortingArray(input);
	for ( int i = 0; i <input.length;i ++) {
		System.out.println(input[i]);
	}

	}

}
