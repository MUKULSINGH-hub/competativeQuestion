package practicing_session;
import java.util.Scanner;
public class SelectionSortP {
public static void SortTheArray( int[] input) {
	for ( int i = 0; i < input.length-1;i++) {
		//loop start from 0th index to n-1 index
		int minimium = input[i];// first the minimium  is =0 and and the miniumium index i also  0'''
		int minimiumIndex = i;
		for( int j = i +1;j<input.length; j++) {
			if(input[j]<  minimium) {
			minimium = input[j];
			minimiumIndex = j;
			}		
		}
		if(minimiumIndex != i) {
		input[minimiumIndex ]= input[i];
		input[i]=  minimium;	
		}
	}
}

	public static void main(String[] args) {
		int[]input = {3,6,8,9,2,3,5,7,8,9};
		SortTheArray(input);
		for(int i = 0;i<input.length-1;i++) {
			System.out.println(input[i]);
		}
		
		

	}

}
