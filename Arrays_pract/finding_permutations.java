package Arrays_pract;

public class finding_permutations {

	public static void main(String[] args) {
		
		int[ ]num = {1,2,3,4};
		int target = 3;
		System.out.println(	permutations(num,target));
	}
	public static int permutations(int[]nums, int target) 
	{
	       // if target is reached, return 1
        if (target == 0) {
            return 1;
        }
 
        // if target cannot be reached, return 0
        if (target < 0) {
            return 0;
        }
 
        // initialize the result with 0
        int count = 0;
 
        // do for each number
        for (int i : nums)
        {
            // recur to see if target can be reached by including the current number `i`
            count += permutations(nums, target - i);
        }
 
        // return the total number of permutations
        return count;
 

	}
}
