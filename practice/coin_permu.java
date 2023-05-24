package practice;

public class coin_permu {

	public static void main(String[] args) {
			int coin[] = {2,4,6,8,10};
			int sum = 8;
			coin_p(coin,sum,"");

	}
	public static void coin_p(int []coin,int sum,String ans) 
	{
		
		if(sum == 0) 
		{
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) 
		{
			if(coin[i] <= sum) 
			{
				coin_p(coin,sum - coin[i],ans+coin[i]);
			}
		}
	}
}