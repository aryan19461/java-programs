package Arrays_pract;
import java.util.*;
public class increasing_subsequence {

	public static void main(String[] args) {
		
		int [] nums = {2,4,5,4};
		System.out.println(findSubsequences(nums));
	}	
	public static void recur(int[] nums , List<List<Integer>> result,Deque<Integer> curr , int start ) 
	{
		if(curr.size() >= 2) 
		{
			result.add(new ArrayList<Integer> (curr) );
		}
		 // start from the next index till the last
        for (int i = start; i < nums.length; i++)
        {
            // if sequence is empty, or current number is more than the previous number
            // in the sequence
            if (curr.isEmpty() || nums[i] > curr.peekLast())
            {
                // append current number to the sequence
                curr.addLast(nums[i]);
 
                // recur for the next index `i+1`
                recur(nums, result, curr, i + 1);
 
                // backtrack: remove current number from the sequence
                curr.removeLast();
            }
        }
    }
 
    public static List<List<Integer>> findSubsequences(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        recur(nums, result, new ArrayDeque<>(), 0);
        return result;
    }
}


