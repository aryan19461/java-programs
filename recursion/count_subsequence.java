package recursion;

public class count_subsequence {
	static int  count =0; 
	public static void main(String[] args) {
		
		String ques ="ABC";
		countandprint(ques,"");
		
	}
	public static void countandprint(String ques , String ans)
	{
		if(ques.length() == 0) 
		{
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		countandprint(ques.substring(1),ans);
		
		countandprint(ques.substring(1),ans+ch);
		
	}
}
