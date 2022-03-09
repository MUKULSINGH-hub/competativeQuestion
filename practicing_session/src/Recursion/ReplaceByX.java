package Recursion;

public class ReplaceByX {
	  public static  int[] twoSum(int[] nums, int target) {
	        for ( int i = 0; i < nums.length;i++){

	        for( int j = i+1;i< nums.length;i++){

	        if(nums[i] + nums[j]==target){


	            return new int[ ]{i,j};
	        }
	        }
	        }
	        return nums;
	      
	    }

	public static void main(String[] args) {
		int[] input = {2,3,4,5,6,8};
              int[] sum = twoSum(input,9);
              for(int i = 0; i <= sum.length-1;i++) {
              System.out.print(sum[i]);
              System.out.print(",");
              };
		
		
		
		
		
		
		
		
		
		
		

	}

}
