package otherTopics;
import java.util.Scanner;

public class ReverseTrainglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int i = 1;
//		while ( i <= n) {
//			int j = 1;
//			while (j <= n-i +1 ) {
//				System.out.print("*");
//				j++;
//			}		
//			System.out.println();
//			i++;
//		}
//		
//		int i = 1;
//		while(i <= n) {
//			int j = 1;
//			while(j< i) {
//				System.out.print(" ");
//				j++;
//			}
//			j = 1;
////			int counter = i;
//			while( j<= n-i) {
//				System.out.print(j);
//				j++;
//			}
//			
//			
//			
//			System.out.println();
//			i++;
//		}
		int i = 1;
		while(i< n) {
			int j = 1;
			while (j <= n-i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
//			int counter = i +1;
			while(j <= i ) {
				System.out.print(i);
				
				j++;
				
			}
			System.out.println();
			i++;
			
			
			
			
		}
		

	}

}
