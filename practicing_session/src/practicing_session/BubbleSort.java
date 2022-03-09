package practicing_session;

public class BubbleSort {
	public static void Bubblesort(int [] input) {
		for( int i = 0; i< input.length-1;i++) {
			for(int j = 0; j<input.length-1-i; j++) {
				if( input[j] > input[j+1]) {
					///what is the procedure of temp 
					// first temp store the value of input[j] -> now the input[j] is empty -> now  we put the value of input[j+1] into the input[j] -> now the input [j+1]is empty now w e put the value of temp in input[j]
					int temp = input[j];
					input[j]= input[j+1];
					input[j+1]= temp;
							
					
				}
				
			}
		}
		
		
	}

	public static void main(String[] args) {
  int[]input = { 9,8,7,6,5,4,3,2,1,0};
  Bubblesort(input);
  for(int i = 0; i<input.length ;i++) {
	  System.out.println(input[i]);
  }
  

	}

}
