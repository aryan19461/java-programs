package ArrayList;

public class product_less_than_K {

	public static void main(String[] args) {
			
		int arr[] = {5,10 ,2,3,5,6,1};
		int  k = 10;
		product(arr,k);

	}
	public static void product(int []arr , int k ) 
	{
		int si = 0;
		int ei = 0;
		int p = 1;
		int ans =0;
		while(ei < arr.length) 
		{
			//window grow
			p = p*arr[ei];
			
			//shrink winndow
			while(p > k && si<=ei) 
			{
				p = p/arr[si];
				si++;
			}
			ei++;
		}
		ans = ans + ei -si+1;
		System.out.println(ans);
	}
}
