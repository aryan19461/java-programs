package productBased;


public class linklist {
	
	
	private class Node 
	{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	
	public void addFirst(int item) 
	{
		Node new_node = new Node(); // creating a new node
		new_node.data = item;
		
		if(size == 0) 
		{
			this.head = new_node;
			this.tail = new_node;
			this.size++;
		}else 
		{
			new_node.next = head;
			head = new_node;
			this.size++;
		}
	}
	
	public void display() 
	{
		Node temp = head;
		while(temp != null) 
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
}
