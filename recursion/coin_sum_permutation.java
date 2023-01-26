package recursion;

public class coin_sum_permutation {

	public static void main(String[] args) {

		int coin[] = {2,4,6,8,10};
		int sum = 14;
		coin_permu(coin,sum,"");
	}
 public static void coin_permu(int coin[] , int sum ,String ans ) 
	{
	 	if(sum == 0) 
	 	{
	 		System.out.println(ans);
	 		return;
	 	}
	 	for (int i = 0; i < coin.length; i++) 
	 	{
	 		if(coin[i] <= sum ) 
	 		{
	 			coin_permu(coin, sum-coin[i], ans+sum);
	 		}
		}
	}
}
