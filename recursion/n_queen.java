package recursion;

public class n_queen {

	public static void main(String[] args) {
		int tq = 4; //tq = total queen
		boolean [][] board = new boolean [tq][tq];
		nqueen( board , tq ,0);
				
	}
	public static void nqueen(boolean[][]  board, int tq ,int row) 
	{
		if(tq == 0) 
		{
			display(board);
			System.out.println();
			return;
		}
		
		for (int col = 0; col < board.length; col++) 
		{
	// if board ke row and col  pe kuch bhi rkh skte hai toh proceed krenge next agr wise stop the program
			if(isitsafe(board,row,col) == true) 
			{
				board[row][col] = true;
				// since we have placed queen on the board so the tq will be reduce by 1 as one queen is place and we will move to the next row
				nqueen(board ,tq-1 , row+1);
				board[row][col] = false;
				
			}
		}
	}
	
	public static boolean isitsafe(boolean[][] board , int row ,int col ) 
	{
		//UPPER SIDE
		int r = row;
		while(r >= 0) 
		{
			if(board[r][col] == true) 
			{
				return false;
			}
			r--;
		}
		
		//Right Diagonal
		int c = col;
		while( r >= 0 && c < board.length) 
		{
			if(board[row][c] == true) 
			{
				return false;
			}
			r--;
			col++;
		}
		
		//LEFT Diagonal
		c = col;
		while(r >=0 && c >=0 ) 
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

