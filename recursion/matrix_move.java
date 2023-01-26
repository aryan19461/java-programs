package recursion;

public class matrix_move {

	public static void main(String[] args) {
		
		int row =3;
		int col =4;
		matrix_move(0,row,col,0,"");
	}
	public static void matrix_move(int cr,int er,int ec,int cc ,String ans) 
	{
		if(cr == er && cc == ec ) 
		{
			System.out.println(ans);
			return;
		}
		if(cr > er || cc > ec) 
		{
			return;
		}
		matrix_move(cr+1,er,ec,cc,ans+"V");
		matrix_move(cr,er,ec,cc+1,ans+"H");
		
	}
}
