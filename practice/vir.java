package practice;

public class vir {

	public static void main(String[] args) {
		int nums[] = {1,1,1,1,1,3,3,3,3,2,2,2,2,2,5,5,5,5,100,100,100,5};
		System.out.println(vir(nums));

	}
	 public static int[] vir(int[] nums) {

	        //Initialize frequency
	        int freq = 0;
	        for(int i=0; i<nums.length; i+=2){
	            freq += nums[i];
	        }

	        int output[] = new int[freq]; //necessary size

	        //now add the values into the array
	        int currentIndex = 0;
	        for(int i=1; i<nums.length; i+=2){ //get the value
	            for(int j=0; j<nums[i-1]; j++){ // add it the number of times as the freq
	                output[currentIndex]=nums[i];
	                currentIndex++;
	            }
	        }

	        return output;
	    }
}
