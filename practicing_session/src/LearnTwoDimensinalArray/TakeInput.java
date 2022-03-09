package LearnTwoDimensinalArray;
import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the value of columns");
		int columns = sc.nextInt();
		int [][]arr = new int[rows][columns];
		 for ( int i = 0; i< rows;i++) {
			 for( int j =0;j<columns;j++) {
				 System.out.println("Enter the   "+i+"th"+"  ,   "+j + "th "+"   elements");
				arr [i][j]  =sc.nextInt();
			 }
		 }
		 System.out.println("now your two diensional array is==");
		 
		 for(int i = 0;i<rows;i++) {
			 for(int j =0;j<columns;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		

	}

}
