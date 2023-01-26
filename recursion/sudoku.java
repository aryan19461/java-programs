package recursion;

public class sudoku {

	public static void main(String[] args) {
		
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
					     { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
					     { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
					     
					     { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
					     { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
					     { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
					     
					     { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
					     { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
					     { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
					     
					  };
	sudo(grid, 0, 0);
		
	}
	public static void sudo(int [][] grid , int row, int col) 
	{
/*
 Here if the col reaches 9 that is end of the col then we will move to the next row and col will start from beginning again		
 */
		if(col == 9) 
		{
			row++;
			col =0;
			
		}
/*
 if the row reaches 9 that is the end of the matrix then we will display the grid matrix
*/
		if(row == 9) 
		{
			display(grid);
			return;
		}
/*
 Now if there is no zero at row and col of the the grid then it means there is some value at that row and col so we can't place the anything there so we will 
 move to the next col and check for it again. if we the zero is found then we check which value we can place from 1 to 9 at that row and col.  		
 */
		if(grid[row][col] != 0 ) 
		{
			sudo(grid , row , col+1);
		}
		else 
		{
			for (int value = 1; value <=9; value++) 
			{
				if(isitsafe(grid,row,col,value) == true) // grid ke row and col pe value rkhskte hai toh insie the loop jaenge or rkh denge value
				{
					grid[row][col] = value;
					sudo( grid, row , col+1); // value rkhne ke baad we will move to next col and check it again for it
					grid[row][col] = 0; // value zero put kri next ki tki ouside the loop aakr continue rkh paye this is called backtracking
				}
			}
		}
	}
	
	public static boolean isitsafe(int[][] grid , int row, int col ,int value ) 
	{
		// checking row is safe or not
		for (int i = 0; i < grid.length; i++) 
		{
			if(grid[i][col] == value) 
			{
				return false;
			}
		}
		// checking column is safe or not
		for (int i = 0; i < grid.length; i++) 
		{
			if(grid[row][i] == value) 
			{
				return false;
			}
		}
		
		//Checking GRID 3*3 inside matrix 
		
		int r = row - row%3;
		int c = col - col%3;
		for (int i = r; i < r+3; i++) 
		{
			for (int j = c; j < c+3; j++) 
			{
				if(grid[i][j] == value) 
				{
					return false;
				}
			}
		}
		
		
		return true;
	}
	public static void display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}
}	













