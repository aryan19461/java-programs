package recursion;

public class dice_roll {

	public static void main(String[] args) {

		int n = 4;
		dice(0,n,"");
	}
	public static void dice( int curr , int n , String ans) 
	{	
		if(curr == n) 
		{
			System.out.println(ans);
			return;
		}
		if( curr > n) 
		{
			return;
		}
		for (int dice = 1; dice <=n ; dice++) 
		{
			dice(curr + dice, n ,ans+dice);
		}
	}
}
