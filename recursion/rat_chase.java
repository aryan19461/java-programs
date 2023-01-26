package recursion;
import java.util.*;
public class rat_chase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] maze = new char [n][m];
		for (int i = 0; i < maze.length; i++) 
		{
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) 
			{
				maze[i][j] = str.charAt(i);
			}
		}
		

		int[][] ans = new int [n][m];
		ratinmaze(maze,0,0,ans);
		
	}
	
	public static void ratinmaze(char[][] maze ,int cr , int cc , int [][] ans) 
	{
		if(cr == maze.length-1 && cc == maze[0].length-1 && maze[cr][cc] != 'x') 
		{
			display(ans);
			return;
		}
		
		maze[cr][cc] = 'x';
		maze[cr][cc] = 1;
		
		int r[]= {-1,1,0,0};
		int c[]= {0,0,1,1};
		
		for (int i = 0; i < c.length; i++) 
		{
			ratinmaze(maze,cr+r[i],cc+c[i],ans);
		}

		maze[cr][cc] = 'O';
		maze[cr][cc] = 0;
		
	}
	
	public static void display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
