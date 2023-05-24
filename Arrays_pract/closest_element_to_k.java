package Arrays_pract;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class closest_element_to_k {

	
	public static void main(String[] args)
	    {
	        List<Integer> input = Arrays.asList(10, 12, 15, 17, 18, 20, 25);
	        int target = 16, k = 4;
	 
	        System.out.println(findKClosestElements(input, k, target));
	    }
	    // Function to find the `k` closest elements to `target` in a sorted list `input`
	    public static List<Integer> findKClosestElements(List<Integer> input, int k, int target)
	    {
	        // find the insertion point using the binary search algorithm
	        int i = Collections.binarySearch(input, target);
	 
	        // Collections.binarySearch() returns `-(insertion point) - 1`
	        // if the key is not contained in the list
	        if (i < 0) {
	            i = -(i + 1);
	        }
	 
	        int left = i - 1;
	        int right = i;
	 
	        // run `k` times
	        while (k-- > 0)
	        {
	            // compare the elements on both sides of the insertion point `i`
	            // to get the first `k` closest elements
	 
	            if (left < 0 || (right < input.size() &&
	                    Math.abs(input.get(left) - target) > Math.abs(input.get(right) - target))) {
	                right++;
	            }
	            else {
	                left--;
	            }
	        }
	 
	        // return `k` closest elements
	        return input.subList(left + 1, right);
	    }
	 
	 
	}
