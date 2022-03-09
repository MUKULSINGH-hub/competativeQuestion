package Question;
import java.util.Scanner;

public class LinearSearch {
	public static int[] takeUserInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size]; // it take input according to size 
		for ( int i = 0; i< size;i++ ) {
			input[i]= sc.nextInt();
			
		}
		return input; // return is input because the return type is array	
	}
	public static void print( int input[]) {
		for( int i =  0; i< input.length; i++) {
			System.out.println(input[i]+" ");
		}
		System.out.println();
	}
	public static int WhichElement(int input[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which element you want to search"+"=");
		int ec = sc.nextInt();
		for( int k = 0;k <= input.length-1;k++) {
			if(input[k] == ec) {
				System.out.print("the Element is present in index "+" = ");
				return k;		
			}		
			}	
		return -1;
	}
	public static void incrementArray(int input[]) {
		input= new int[5]; /// this statement change the old input allocate new address 
		for(int i =0;i<input.length;i++) {
			input[i]++;
		}
		
	}
	public static void SwapAlternative(int input[]) {
		for(int i = 0;i < input.length-1;i+=2) {
			int temp = input[i];
			input[i]=input[i+1];
			input[i+1]= temp;	
		}	
	}
	public static void main(String[] args) {
		int arr[ ]= {2,4,6,7,8,9};
//		incrementArray(arr);
		SwapAlternative(arr);
		print(arr);
		
		
//	int arr[]= takeUserInput();
//	print(arr);
//	int element = WhichElement(arr);
//	System.out.println(element);

	}

}
