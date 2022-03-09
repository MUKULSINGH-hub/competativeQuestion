package Recursion;

public class Sumoffirstnum {
	public static int sum(int n) {
		if (n==1) {
			System.out.println("return 1");
			return 1;
		}
		System.out.println("earlier");
		
		return sum(n-1)+3;
	
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(sum(n));

	}

}
