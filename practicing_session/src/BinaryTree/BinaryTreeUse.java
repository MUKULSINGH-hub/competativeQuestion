package BinaryTree;
import java.util.Scanner; 

public class BinaryTreeUse {
	public static Binarytree<Integer> TakeUserInput( boolean isRoot,  int parentData, boolean  isLeft  ){
		if(isRoot) {
			System.out.println("Enter the root data");
		} 
		else {
			if(isLeft) {
				System.out.print("Enter left child of "+ parentData);
			}else {
				System.out.print("Enter right child of "+ parentData);
			}
		}
		System.out.println("Enter the root=");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if (rootData == -1) {
			return null;
		}
		Binarytree<Integer> root = new Binarytree<Integer>( rootData) ;
		Binarytree<Integer> leftChild = TakeUserInput( false,rootData,true);
		Binarytree<Integer> rightChild= TakeUserInput( false,rootData,false);
		root.left = leftChild;
		root.right= rightChild;
		return root;	
	}  
	public static int numNodes(Binarytree<Integer>  root) {
		if (root ==null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount= numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	
	
	// this function is only for print the value
	public static void printTreeDetailed(Binarytree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data +":");
		if(root.left!=null) {
			System.out.print( "  "+"Left data "+"=" +root.left.data);
		}
		if(root.right!=null) {
			System.out.print("  "+"Right data"+"="+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
		
	}
	
	public static int largest(Binarytree<Integer> root) {
		if (root == null) {
			return -1;
		}
		int  leftLargest = largest(root.left);
		int rightLargest= largest(root.right);
		return Math.max(root.data, Math.max(leftLargest,rightLargest));// function for knowing who is largest;;;;;;;;;;
		
	}
	public static int numOfLeaves(Binarytree<Integer> root) {
		if (root==null) {
			return 0;
		}
		if(root.left==null && root.right ==null   ) {
			return 1;	
		}
		return 1 +  numOfLeaves(root.left) + numOfLeaves(root.right);
		
	}
	

	public static void main(String[] args) {
	
//		
//		Binarytree<Integer>root = new Binarytree<Integer>(2); //it have root data
//		Binarytree<Integer>rootLeft = new Binarytree<Integer>(5);
//		Binarytree<Integer>rootRight = new Binarytree<Integer>(7);
////		connecting the roots
//		root.left = rootLeft;
//		root.right = rootRight;
		Binarytree<Integer> root = TakeUserInput( true,0,true    ); 
		printTreeDetailed(root);
		System.out.println("Number of Nodes" + numNodes(root));
		System.out.println("Largest node"+ "   "+largest(root));
		System.out.println("Number of root" + " ===="+numOfLeaves(root));
//		Binarytree<Integer>tworootleft = new Binarytree<Integer>(8);
//		Binarytree<Integer>tworootRight = new Binarytree<Integer>(9);
//		rootLeft.right = tworootleft;
//		rootRight.left= tworootRight;
//		
//		
		
		

	}

}
