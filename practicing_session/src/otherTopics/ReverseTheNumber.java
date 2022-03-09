package otherTopics;
import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int temp = N; //temp value is the user input
		 int revNum = 0;
		 while(temp > 0) {
			 int lastDigit = temp % 10 ; // it find the last digit...///
			 temp = temp/10;//it change the value of temp//..
			 revNum = revNum * 10 + lastDigit;
		 }
		 System.out.println(revNum);
		

	}

}
