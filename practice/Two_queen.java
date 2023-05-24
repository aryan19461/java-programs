package practice;

public class Two_queen {

	public static void main(String[] args) {
	
		int queen = 2;
		boolean board[] = new boolean[5];
		two_queen(board,0,queen,"");
	}
	public static void two_queen(boolean board[], int qpsf,int queen, String ans) 
	{
		if(qpsf == queen) 
		{
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < board.length; i++) 
		{
			if(board[i] == false) 
			{	
				board[i] = true;
				two_queen(board,qpsf+1,queen,ans+"A"+qpsf+"B"+queen);
			}
		}
		
	}

}
