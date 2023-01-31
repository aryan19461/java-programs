package stack_queue_quest;
import java.util.Stack;
public class st_stock_span {

	public static void main(String[] args) {
		
		int arr[] = { 23, 12, 34, 56, 34, 67};
		CalSpan(arr);
	}
	public static void CalSpan(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			// next Greater bana raha hu
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();

			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}

			// next greater banana hai
			st.push(i);
		}
		for (int a = 0; a < ans.length; a++) {
			System.out.print(ans[a] + " ");
		}

	}
}
