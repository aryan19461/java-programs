package practice;

import java.util.Scanner;

public class code_test_vericle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,4,6,8,10,12,16,18};
		System.out.println("Enter the sum to check = ");
		int targetSum = sc.nextInt();
		Tsum(arr,targetSum);

	}
	public static void Tsum(int[] arr, int targetSum) 
	{
	    for (int i = 0; i < arr.length - 1; i++) 
	    {
	        for (int j = i + 1; j < arr.length; j++) 
	        {
	            if (arr[i] + arr[j] == targetSum) {
	                System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
	                return;
	            }
	        }
	    }
	    System.out.println("No pair found.");

	}


}
