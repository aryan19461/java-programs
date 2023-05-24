package practice;

public class n_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TQ = 4; //tq = total queen
		boolean [][] board = new boolean [TQ][TQ];
		Nqueen(board,0,TQ,"");
	}
	public static void Nqueen(boolean board[][],int row,int TQ,String ans) 
	{
		if(TQ == 0 ) 
		{
			display(board);
			return;
		}
		
		for (int col = 0; col < board.length; col++) 
		{
			if(isitsafe(board,row,col) == true) 
			{
				board[row][col] = true;
				Nqueen(board,row+1,TQ-1,ans+"A"+TQ);
				board[row][col] = false;
				
			}
		}
	}
	public static boolean isitsafe(boolean board[][],int row,int col) 
	{
		// upper side
		int r = row;
		while(r > 0) 
		{
			if(board[r][col] == true) 
			{
				return false;
			}
			r--;
		}
		
		// right diagonal
				int c = col;
				while(c < board.length) 
				{
					if(board[row][c] == true) 
					{
						return false;
					}
					r--;
					c++;					
				}
		//left diagonal
		while(r >=0 && c >= 0) 
		{
			if(board[r][c] == true) 
			{
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
	public static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}
}
