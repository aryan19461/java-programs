package stack_queue;

public class stack_front {

	public static void main(String[] args) throws Exception {
		stack st = new stack(5);
		//st.pop();
		
	//Exception in thread "main" java.lang.Exception: Stack is Empty so can not delete anything --> self made error 
		
		System.out.println("adding items in the stack = ");
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.Display();
/*
adding items in the stack = 
1  2  3  4  5  		

*/
		System.out.print("popped element is = " );
		st.pop();
		System.out.print("Top element is = " );
		st.peek();
/*
popped element is = 5
Top element is = 4  
*/
		
		
	}

}
