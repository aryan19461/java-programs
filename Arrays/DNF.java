package Arrays;

public class DNF {

	public static void main(String[] args) {
		
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		dnf(arr);
		
	}
	public static void dnf(int []arr) 
	{
		int i = 0 ; // starting index point 
		int j = arr.length-1 ;  // last index point
		int k = 0 ; // traversing point
		
		while(k <= j) 
		{
			if(arr[k] == 2) 
			{
				int temp = arr[j]; // last elmnt ki value lost na ho isliye use temp me store kra
				arr[j] = arr[k]; // jth positoin yani last position me 2 ko yani kth value daali jo is time 2 hai
				arr[k] = temp; // kth index pe 2 ko hatane baad save rkhi gyi jth value ko rkh diya kth pe
				j--; //here we filling from back side so jth index will decrease after each iteration as value are being placed in every iteration
			}
			else if(arr[k] == 0) 
			{
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++; // i++ is down as element filling is done from starting 
				k++;
			}else 
			{
			k++;
			}
		}
		for (int index = 0; index < arr.length; index++) 
		{
			System.out.print(arr[index] + " ");
		}
	
	}
	
}
