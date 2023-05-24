package Arrays;

public class min_no {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3, 4, -6, 4, -3, 11, 5 };
		
		Minvalue(arr);

	}

	public static void Minvalue(int[] arr) {

		
		int min = arr[0];
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			if(arr[i] < min) 
			{
				min = arr[i];
			}
		}
		System.out.println(min);

	}
}
