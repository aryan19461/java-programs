package Arrays;

public class reverse_range_between {

	public static void main(String[] args) {
		
		int[] arr = { 2, 3, 4, 5, 11, 15, 6, 7, 70, 90, -6, 11, 15 };	
		int i = 2;
		int j = 6;
		reverse(arr,i,j);
		for (int k = 0; k < arr.length; k++) 
		{
			System.out.print(arr[k] + " ");
		}
	}
	public static void reverse(int arr[] ,int i , int j) 
	{

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
}
