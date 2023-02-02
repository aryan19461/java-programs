package Arrays;

public class reverse_specific {

	public static void main(String[] args) {
			
			
		int arr[] = { 1,2,3,4,5,6,7,8 };
		int k =3;
		rotate(arr,k);
/* k = k%n --> when we are told to rotate a array at 300th where k =300 
	so when we do the k =k%n then we are directly going to the required k value..
	eg:- k =300 so k%n is supppose 7 which gives us the orignal array 
	 		
	 		
*/
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	
		
	}
	public static void rotate(int arr[] , int k) 
	{
		int n = arr.length;
		k = k % n;
/*

1) phle zero index se lekr kth element tk reverse krna hai --> 0 to n-k-1(not including the kth elemnt)   		
2) then kth index se lekr last element tk n-k to n-1 (including the kth element)
3) all element reverse  0 to n-1

*/
// 1st n-k element reverse krna h
		reverse(arr, 0, n - k - 1);
		
// last k element reverse krna h
		reverse(arr, n - k, n - 1);
		
// All element Reverse krna h
		reverse(arr, 0, n - 1);
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