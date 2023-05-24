package Arrays_pract;

public class minimal_removal_in_arrays {
	
    public static void main(String[] args)
    {
        int[] arr = { 4, 6, 1, 7, 5, 9, 2 };
        System.out.println("The minimum number of removals is " + findMin(arr));
    }
	
	public static int findMin(int[] arr)
    {
        // Stores the length of the maximum size subarray
        int max_range = 0;
 
        // To keep track of the minimum and the maximum elements in a subarray
        int min, max;
 
        // Traverse the array and consider each element as a starting point
        // of a subarray
        for (int i = 0; i < arr.length && arr.length - i > max_range; i++)
        {
            // Reset the minimum and the maximum elements
            // (from the previous iteration of the loop)
            min = max = arr[i];
 
            /*
                Subarray invariant: max < 2×min
            */
 
            // Find the maximum size subarray `arr[i…j]` that satisfies
            // the above invariant
            for (int j = i; j < arr.length; j++)
            {
                // Find the minimum and the maximum elements in the current subarray.
                // We must do this in constant time.
                min = Integer.min(min, arr[j]);
                max = Integer.max(max, arr[j]);
 
                // Discard the subarray if the invariant is violated
                if (2 * min <= max) {
                    break;
                }
 
                // Update `max_range` when a bigger subarray is found
                max_range = Integer.max(max_range, j - i + 1);
            }
        }
 
        // Return array size - length of the maximum size subarray
        return arr.length - max_range;
    }
 
}
