package ZgreekForGreekQuestions;

import java.util.Scanner;

public class SearchNumber {
	public static int[] takeUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] input1 = new int[size];
		System.out.println("Enter your     " + size + "     numbers");
		for (int i = 0; i < input1.length; i++) {
			input1[i] = sc.nextInt();
		}
		return input1;

	}

	public static int searchnumber(int[] input, int num) {
		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i] == num) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int input2[] = takeUserInput();
		int serchnum = searchnumber(input2, 4);
		if (serchnum == -1) {
			System.out.println("Element is not present in array ");
		} else {
			System.out.println("Element is present at index==" + serchnum);
		}
		System.out.println(serchnum);

	}

}
