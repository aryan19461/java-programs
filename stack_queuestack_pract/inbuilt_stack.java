package stack_queuestack_pract;

import java.util.Stack;

public class inbuilt_stack {
	public static void main( String[] args ) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		
		System.out.println(stack.pop() + "  is deleted"); // LIFO --> last element is remove first
		System.out.println(stack);
	}
	
}
