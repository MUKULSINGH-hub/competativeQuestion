package otherTopics;
import java.util.Scanner;

public class QueestionOfloop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i =1;
		int j=1;
		while(i<=N) {
			int num = 3*j+2;
			if ( num%4!=0) {
				System.out.println(num);
				i++;				
			}
			j++;
		}	
		
	}
}
