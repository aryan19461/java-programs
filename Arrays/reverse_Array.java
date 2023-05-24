package Arrays;
import java.util.Arrays;
public class reverse_Array {

	public static void main(String[] args) {
		
		int arr[] = {1,10,2,3,4,20,30,50};
		Arrays.sort(arr);
		reverse(arr);
	}
	public static void reverse(int arr[]) 
	{

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for (int k = 0; k < arr.length; k++) 
		{
			System.out.print(arr[k] + " ");
		}
	}

}
