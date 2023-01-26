package recursion;
import java .util.*;
public class palindrome_partioning {

	public static void main(String[] args) 
	{
		String ques = "aryan";
		List<String> li = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		partioning(ques,li,ans);
		System.out.println(ans);
	}
	public static void partioning(String ques , List<String> li, List<List<String>> ans) 
	{
		if(ques.length() == 0) 
		{
			ans.add(new ArrayList<> (li));
			return;
		}
		
		for (int i = 1; i <= ques.length(); i++) 
		{
			String s = ques.substring(0, i); // to make every sequence a seperate arraylist and store
			if(ispalindrome(s) == true) 
			{
				li.add(s);  //adding first substring 
				partioning(ques.substring(i) ,  li , ans);
				li.remove(li.size()-1); // removing last index
			}
		}
		
		
		
	}
	public static boolean ispalindrome(String ques) 
	{
	//Two pointer i and j . i from the start and j from the last index	
		int i = 0; 
		int j = ques.length()-1;
		while( i<j ) 
		{
			if(ques.charAt(i) != ques.charAt(j)) 
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
