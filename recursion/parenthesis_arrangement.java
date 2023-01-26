package recursion;
import java.util.*;
public class parenthesis_arrangement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		int n = 3;
		parent(n,0,0,"",list);
		System.out.println(list);
	}
	public static void parent(int n , int start ,int end ,String ans , List<String> list) 
	{
		if(start == n && end == n) 
		{
			list.add(ans);
			return;
		}
		
		if(start < n) 
		{
			parent(n,start+1,end,ans+"{",list);
		}
		if(start >end) 
		{
			parent(n,start,end+1,ans+"}",list);
		}
		
	}
}
