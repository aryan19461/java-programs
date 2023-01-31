package stack_queue;
import java.util.Stack; //importing  inbuilt Stack

public class put_in_down_stack {

	public static void main(String[] args) {
			Stack<Integer> st = new Stack<>();
			st.push(5);
			st.push(4);
			st.push(3);
			st.push(2);
			st.push(1);
			System.out.println(st);
			// o/p of st --> [5, 4, 3, 2, 1] 
// Now when we push 6 in stack then it will be stored in front of 1 
			st.push(6);
			System.out.println(st);
//			[5, 4, 3, 2, 1, 6]
	
// when we use InsertDown function for 7 then 7 will be stored before 5 that is from backside adding is going on 			
			InsertDown(st, 7);
			System.out.println(st);

	}
	public static void InsertDown(Stack<Integer> st , int i) 
	{
		if(st.isEmpty()) 
		{
			st.push(i);
			return;
		}
		int item = st.pop(); // storing the deleted value in item
		InsertDown(st,i);
		st.push(item);
	}

}
