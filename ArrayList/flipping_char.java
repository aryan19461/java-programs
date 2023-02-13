package ArrayList;

public class flipping_char {

	public static void main(String[] args) {

		String str = "aababababaaabbb";
		int  k = 3;
		int flipA = flipChar(str,k,'a');
		int flipB = flipChar(str,k,'b');
		System.out.println(Math.max(flipA, flipB));
	}
	public static int flipChar(String str , int  k , char ch) 
	{
		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans = 0 ;
		while(ei < str.length()) 
		{
			if(str.charAt(ei) == ch) 
			{
				flip++;
			}
			//Shrinking
			while(flip > k  && str.charAt(si) < ei) 
			{
				flip--;
			}
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
	return ans;
	}
}
