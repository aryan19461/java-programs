
/*
o/p--> [0, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 2, 20, 21, 22, 23, 24, 25, 26, 27, 28, 3, 30, 4, 5, 6, 7, 8]
 
*/

package recursion;
import java.util.*;
public class lexical_counting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int UL = 30; //UL = upper limit
		lexical( UL , 0, list);
		System.out.println(list);
	}
	public static void lexical(int UL , int curr,List<Integer> list ) 
	{
		if(curr > UL) 
		{
			return;
		}
		list.add(curr);
		int i = 0;
		if(curr == 0) 
		{
			i =1;
		}
		while(i < 9) 
		{
			lexical( UL , curr*10+i , list) ;
			i++;
		}
	}
}
