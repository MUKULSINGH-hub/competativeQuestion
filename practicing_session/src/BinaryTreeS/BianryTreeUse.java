package BinaryTreeS;
import java.util.Scanner;


public class BianryTreeUse {
	public static Binarytreemain<Integer> takeUserInput( boolean isRoot , int parentData , boolean isLeft  ) { 
		if(isRoot) {
			System.out.println("Enter the root data :");
		}
		else {
			if(isLeft) {
				System.out.println("Enter the left root :"+ parentData);
			}
			else
			{
				System.out.println("Enter  the right root :"+ parentData);
			}	
		}
//		System.out.println("Enter the root data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null ;
		}
		Binarytreemain<Integer> root = new Binarytreemain<Integer>(rootData);
		Binarytreemain<Integer> rootLeft = takeUserInput(false,rootData,true);
		Binarytreemain<Integer> rootRight= takeUserInput(false,rootData,false);
		root.left =rootLeft;
		root.Right = rootRight;
		return root;
		
	}
	
	public static void printDetailed(Binarytreemain<Integer> root) {
		
		if(root==null) {
			return;
		}
		System.out.print(root.data);
		if(root.left!= null) {
			System.out.print(" "+"Left data"+"=="+root.left.data);
		}
		if(root.Right!=  null) {
			System.out.print( " "+"Right data "+"=="+root.Right.data);
		}
		System.out.println();
		printDetailed(root.left);
		printDetailed(root.Right);
		
	}
	public static void main(String[] args) {
		Binarytreemain<Integer> root = takeUserInput(true,0,true);
		printDetailed(root);
	

	}

}
