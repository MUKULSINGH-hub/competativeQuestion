package practicing_session;

import java.util.Scanner;
public class practise1 {

	public static void main(String[] args) {
		System.out.println("enter your real age");
     Scanner sc = new Scanner(System.in);
     String Var = "Mukul";
		
//		if(age>=18) {
//			System.out.println("you are eligible for vote");
//		}
//		else if(age>35) {
//			System.out.println("you are elgible for all the things");
//		}
//		else if(age>50) {
//			System.out.println("you are getting older");
//		}
//		else{
//			System.out.println("you are got older");
//		we can replace break to ->
//     y
	    
     switch(Var) {
     case "Mukul" ->
    	 System.out.println("ypu are eligible for vote");
     case "SUBHAM"->
    	 System.out.println("you are eligible for some more things");
     case "ROHIT"->
    	 System.out.println("you are eliigible for all the things");
    	default->	 System.out.println("thanks for your survey");
     }
     System.out.println("tahnks");
     
     
	}
	

}

