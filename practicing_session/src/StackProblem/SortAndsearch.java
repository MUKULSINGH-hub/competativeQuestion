package StackProblem;
import java.util.Scanner;

public class SortAndsearch {
	public static int[] takeUserData( ) {    // we use int[] because we will take a number in array type;
		Scanner sc = new Scanner(System.in);
		// first we ask the size of array
		int size = sc.nextInt();
		int [] input = new int[size];
		for( int i = 0; i < size; i++) {
			input[i]= sc.nextInt();	
		}	
		return input;
	}
	public static void SortingArray(int[] input) {
		for( int i = 0; i<input.length-1;i++  ) {
			int minimium = input[i];
			int minimiumIndex = i;
			for( int j = i + 1; j< input.length; j++) {
				if( input[j]< minimium) {
					minimium = input[j];
					minimiumIndex = j;
					
				}
			}
			if(minimiumIndex!= i) {
				input[minimiumIndex]= input[i];
				input[i]= minimium;
			}
			
		}
		
	}
	public static void print(int[] input) {
		System.out.println("Sorted array is ");
		for(int i = 0; i < input.length;i++) {
			System.out.println( input[i]);
		}
		System.out.println();
	}
	public static int BinarySearch(int[]input , int element) {
		int start = 0;
		int end = input.length-1;
		while( start <= end) {
			int mid = (start + end )/2;
			if(element == mid) {
				return mid;
			}else if( element  > input[mid]) {
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[ ]arr = takeUserData();
		SortingArray(arr);
		print(arr);
	   int index =	BinarySearch(arr,5);
	   System.out.println(index+" ");

	}

}
