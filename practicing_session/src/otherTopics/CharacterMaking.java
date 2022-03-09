package otherTopics;
import java.util.Scanner;

public class CharacterMaking {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int i = 1 ;
		while(i <= k) {
			int j = 1;
			char startingchar = (char)('A' +i -1);
			while(j<=k) {
				System.out.print(startingchar);
				startingchar =(char)( startingchar+1);
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		
		

	}

}
