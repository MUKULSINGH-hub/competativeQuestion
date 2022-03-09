package string;
import java.util.Scanner;

public class Strings {
	public static void Printchars(String str) {
		for( int i = 0;i < str.length();i++) {
			System.out.println(str.charAt(i));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String str = "Mukesh";
//       System.out.println(str.length());
//       System.out.println(str.charAt(2));//for knowing what is in the index 2;;;;;  we are using '''''''charAt() '''''''''''''''''''''''   output of this line is 'k'
//       // we can also addd two or more string..
//       
//       String s1 = "Mukesh";
//       String s2= "  singh";
//       String s3 = "  Adhikari";
//       System.out.println(s1+s2+s3);
       
       //TAKING INPUT FROM THE USER;
//		Scanner sc= new Scanner(System.in);
//		String str;
////		str = sc.next();
//		str = sc.nextLine();
//		System.out.println(str);
//		System.out.println(str.length());
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Printchars(str);
		
       
       }

}
