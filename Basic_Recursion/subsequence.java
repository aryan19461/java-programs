package Basic_Recursion;

public class subsequence {

	public static void main(String[] args) {
		String str = "ABC";
		printanswer(str,"");
	}

	public static void printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		printanswer(ques.substring(1), ans);
		printanswer(ques.substring(1), ans + ch);

	}

}
