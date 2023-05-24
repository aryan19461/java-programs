package stack_queuestack_pract;

public class custom_stack {
	
	protected int arr[];
	protected int front = 0;
	protected int size = 0;
	
	
	public custom_stack() 
	{
		this.arr = new int[5];
		front = 0;
		size =  0;
	}

	public custom_stack(int cap) 
	{
		this.arr = new int[cap];
		front = 0;
		size =  0;
		
	}
	public boolean isEMPTY() 
	{
		return size == 0;
	}
		
	public boolean isFULL() 
	{
		return size == arr.length;
	}
	
	public void Enqueue(int item) throws Exception
	{
		if(isFULL() == true) 
		{
			throw new  Exception("Array is full so you cannot add any more element");
		}
		int index = (size + front) % arr.length;
		arr[index] = item;
		size++;
	}
	
	public int Dequeue(int item) throws Exception
	{
		if(isEMPTY() == true) 
		{
			throw new Exception("Array is emtpty so cannot delete anything");
		}
		int val = arr[front];
		front = (front +1) % arr.length;
		size--;
		return front;
	}
	
	
	
}
	
	
	
