package stack_queue_quest;
import java.util.Stack;

public class st_next_greater_element {

	public static void main(String[] args) {
		
		int arr[] = {11,1,2,3,4,5,6,7,8,9};
		NGE(arr);
	}
	
	public static void NGE(int arr[]) 
	{
		Stack<Integer> st = new Stack<>();
		int ans[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) 
		{
			while(!st.empty() && arr[i] > st.peek()) 
			{
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.empty()) 
		{
			ans[st.pop()] =-1;
			
		}
			
		for (int i = 0; i < ans.length; i++) 
		{
			System.out.println(arr[i] + "  " +ans[i]);
		}
	}

}
