package in.dsa.recursion;


public class SplitArray {

	
	public static boolean splitArray(int[] input, int index, int lSum, int rSum) {
		
		if(index == input.length) {
			return lSum == rSum;
		}
		
		if(input[index] % 5 == 0) {
			lSum = lSum + input[index];
		}
		else if(input[index] % 3 == 0) {
			rSum = rSum + input[index];
		}
		else {
			return splitArray(input, index+1, lSum+input[index], rSum) || splitArray(input, index+1, lSum, rSum+input[index]);
		}
		
		return splitArray(input, index+1, lSum, rSum);
		
	}
	
	
	public static boolean splitArray(int input[]) {

		return splitArray(input,0,0,0);

	}


	public static void main(String[] args) {
		
	}

}
