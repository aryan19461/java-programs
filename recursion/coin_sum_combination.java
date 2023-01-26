package recursion;

public class coin_sum_combination {

	public static void main(String[] args) {
		
		int coin[] = {2,3,5,6};
		int sum = 5;
		coin_combo(coin,sum,"",0);
	}
	public static void coin_combo(int coin[] , int sum , String ans , int last) 
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
				coin_combo(coin , sum-coin[i] ,ans+coin[i],i );
			}
		}
	}
}
