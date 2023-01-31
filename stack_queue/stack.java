package stack_queue;

public class stack {
		
		protected int arr[];
		int top; 
// By default if user does not enter any specific array size then array will be of  5 elements		
		public stack() 
		{
			arr = new int[5];
		}
// Here user can define the size of it array according to his/her use		
		public stack(int cap) 
		{
			arr = new int [cap];
			top = -1;
			
		}
		
		public boolean isEmpty() 
		{
			return top ==-1;
		}
		public boolean isFull() 
		{
			return top == arr.length-1;
		}
		
		public  void push(int item) throws Exception 
		{
			if(isFull() == true) 
			{
				throw new Exception("Stack is full so can't add new item in it");
			}
// generally top = -1 which shows that array is empty so first we will increment top to signify that it is no longer empty but has some space			
			top++;
			arr[top] = item;
			
		}
		
		public void pop() throws Exception
		{
			if(isEmpty() == true) 
			{
				throw new Exception("Stack is Empty so can not delete anything ");
			}
	// top position value of a array will be stored in a variable and top will decrement by position showing that one element is deleted then that variable will will printed to show user that this value is deleted
			int delete_element = arr[top];
			top--;
			System.out.println(delete_element);
		}
		
// peek function will show you the value at top position	
		public void peek() throws Exception
		{
			if(isEmpty() == true) 
			{
				throw new Exception("Stack is Empty so can not show anything ");
			}
			int val = arr[top];
			System.out.println(val);
		}
		
		public void Display() 
		{
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
}
