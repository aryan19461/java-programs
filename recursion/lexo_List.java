package recursion;

import java.util.ArrayList;
import java.util.List;

public class lexo_List {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int curr = 0 ;
		int  UL = 30;
		lexo(curr,UL,list);
		System.out.println(list);
		
	}
	public static void lexo(int curr , int UL , List<Integer> list) 
	{
		
		if(curr > UL) {
			return;
		}
		int  i = 0;
		if(curr == 0) 
		{
			 i = 1;
		}
		list.add(curr);
		while(i < 9) 
		{
			lexo(curr*10+i , UL , list);
			i++;
		}
	}

}
