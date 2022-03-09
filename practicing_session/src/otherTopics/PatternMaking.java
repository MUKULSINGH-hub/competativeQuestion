package otherTopics;
import java.util.Scanner;

public class PatternMaking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
//		int i = 1;
//		while(i <= k) {
//			int j = 1;
//			while	( j <= k) {
//				System.out.print("1");
//				j++;
//			}
//			System.out.println("2");
//			i++;
//			
//			
//			
//		}
		
//		int i = 1;
//		while(i <=k) {
//			int j = 1;
//			while(j<= i) {
//				System.out.print(j);
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
//		int i = 1;
//		while(i <= k) {
//			int j =1;
//			int startingNumber =i;
//			while(j<= i) {
//				System.out.print(startingNumber);
//				startingNumber++;
//				j++;
//			}
//			System.out.println();
//			i++;
//		}	
		
		int i = 1;
		int counter = 1;
		while(i <= k) {
			int j =1;
			while(j<=i) {
				System.out.print(counter+"   ");
				counter++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
