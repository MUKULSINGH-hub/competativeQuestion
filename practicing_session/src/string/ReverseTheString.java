package string;

public class    ReverseTheString {
	public static String reversestring(String str) {
	
	String StringReverse = "";
	for(int i = str.length()-1; i>=0;i--) {
		StringReverse = StringReverse + str.charAt(i);
		
	}
	return StringReverse;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mukesh";
		
		 String k =reversestring(str);
		System.out.println(k);

	}

}
