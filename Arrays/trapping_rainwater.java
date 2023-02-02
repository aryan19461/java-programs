package Arrays;

public class trapping_rainwater {

	public static void main(String[] args) {
		
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		trappingRW(arr);
		
	}
	public static void trappingRW( int arr[] ) 
	{
		int n = arr.length;
		
		//left side of array
		int LEFT[] = new int[n];
		LEFT[0] = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			LEFT[i] = Math.max(LEFT[i-1], arr[i]);
		}
		
		//right side of array
		int RIGHT[] = new int[n];
		RIGHT[n-1] = arr[n-1];
		for (int i = n-2; i >=0 ; i--) 
		{
			RIGHT[i] = Math.max(RIGHT[i+1], arr[i]);
		}
		
		// minimum of both right and left and removing arr[i] from the min one
		int sum = 0;
		for (int i = 0; i < RIGHT.length; i++) 
		{
			sum = sum + Math.min(LEFT[i], RIGHT[i]) - arr[i];
			
		}
		System.out.println(sum);
	}
}
