package stack_queue;

public class queue {
		protected int arr[];
		protected int front  = 0;
		protected int size  = 0;
		
		public queue() 
		{
			this.arr = new int [5];
			front =0 ;
			size = 0;
		}
		public queue(int cap) 
		{
			this.arr = new int[cap];
			front =0 ;
			size = 0;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}

		public boolean isfull() {
			return size == arr.length;
		}

		public int size() {
			return size;
		}
		
		public void Enqueue(int item) throws Exception
		{
			if(isfull() == true) 
			{
				throw new Exception("Queue is full ");
			}
			int idx = (front+size) % arr.length;
			arr[idx] = item;
			size++;
		}
		public int dequeue() throws Exception
		{
			if(isEmpty() == true) 
			{
				throw new Exception("Nothing to delete...");
			}
			int val = arr[front]; // storing front in a variable to show later  
			front = (front + 1) %arr.length; //moving our front pointer 
			size--;
			return val;
		}
		
		public int getFront() throws Exception
		{
			if(isEmpty() == true) 
			{
				throw new Exception("Nothing to show...");
			}
			int starting_element = arr[front];
			return starting_element;
		}
		
		public void Display() 
		{
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				System.out.print(arr[idx] + " ");
			}
			System.out.println();
		}
		
	
}




