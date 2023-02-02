package Arrays;

public class kadane_algo {

	public static void main(String[] args) {
			
		int arr[] = {5,8,10,12,53,22,89,100};
		kadane(arr);
		
	}
	public static void kadane(int []arr) 
	{
		int ans = Integer.MIN_VALUE; // storing the minimum value of integer in ans varable
		int sum =0 ;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum +arr[i]; // Doing sum of each elements in array
			ans = Math.max(ans, sum); // comparing with ans and storing max value in each iteration
			if(sum < 0) 
			{
				sum = 0 ;
			}
		}
		System.out.println(ans);
	}
}
