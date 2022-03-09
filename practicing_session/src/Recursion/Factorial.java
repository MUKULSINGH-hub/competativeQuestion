package Recursion;

public class Factorial {
	public static int fact(int n) {
		System.out.println("njhd");
		if(n==0) {
			return 1;
		}
		System.out.println("hjhj");
		int smallans = fact(n-1);
		System.out.println("kjh");
		return n * smallans;
		
	}

	public static void main(String[] args) {
		int n = 4;
		int ans = fact(n);
		System.out.println(ans);

	}

}
