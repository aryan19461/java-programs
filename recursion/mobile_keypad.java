/*
 	i/p = 23
 	o/p = [ad, ae, af, bd, be, bf, cd, ce, cf]

*/

package recursion;
import java.util.*;
public class mobile_keypad {
	
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String ques = "23";
		keypress(ques,"",list);
		System.out.println(list);
	}
	public static void keypress(String ques, String ans,List<String> list ) 
	{
		if(ques.length() == 0) 
		{
		//	System.out.println(ans);
			list.add(ans);
			return;
			
		}
		
		char ch = ques.charAt(0);
		String press = key[ch - '0'];
		for (int i = 0; i < press.length(); i++) 
		{
			keypress(ques.substring(1) , ans+press.charAt(i),list);
		}
	}
}
