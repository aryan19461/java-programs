package recursion;

public class queen_permutation {

	public static void main(String[] args) {

		boolean board[] = new boolean[4];
		int queen = 2;
		queen_permu(board,queen,0,"");
		
	}
	public static void queen_permu( boolean board[] ,int queen , int qpsf ,String ans) 
	{
		if( queen == qpsf) 
		{
			System.out.println(ans);
			return;
		}
		//qpsf = queen place so far
		for (int i = 0; i < board.length; i++) 
		{
			if( board[i] == false) 
			{
				board[i] = true;
				queen_permu( board, queen ,qpsf+1 ,ans+"A"+i +"B"+qpsf  );
			}
		}
	}
}
