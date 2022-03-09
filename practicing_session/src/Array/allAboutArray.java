package Array;
import java.util.Scanner;

public class allAboutArray {
	public static int LargestNumber(int input[]) {
		int max = Integer.MIN_VALUE; // it is the minimium value of like ( - infinity)
		for(int i = 0; i <input.length;i++) {
			if(input[i]> max) {
				max =input[i];
			}
		}
		return max;
	}
	public static int[ ] takeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the array size"+"=2 ");
		int size = sc.nextInt();
		int input[]= new int [size];
		for(int i = 0; i <size;i++  ) {
			input[i]=sc.nextInt();
		}
		return input;
		
	}
	public static void print(int input[]) {
		System.out.println(" Now your inputs number is "+"= ");
		int size = input.length;
		for (int i = 0; i<size; i++) {
			System.out.println(input[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		int  arr[]=  takeUserInput();
		print(arr);
		int Largest = LargestNumber(arr);
		System.out.println("Largest"+"="+ Largest);
		


	}

}
