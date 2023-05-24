package linked_list;

public class LinkedList {
		
	private class Node
		{
			int val;
			Node next;
		}
	private Node Head;  // 1st element is stored in head
	private Node tail; // last element is stored in tail
	private int size;
			
//Adding item from starting	
	public void addFirst(int item) 
	{
		Node new_node = new Node();
		new_node.val = item;
// if size = 0 that means there is nothing so head and tail item will be same 		
		if(size == 0) 
		{
			this.Head = new_node;
			this.tail = new_node;
			this.size++;
		}
	// if there are some node initially then we will only work on head
		else 
		{
			new_node.next = Head;
			Head = new_node;
			this.size++;
		}
	}
// Adding item from the last	
	public void addLast(int item) 
	{
		if(size == 0 ) // repeating the add first if there is nothing
		{
			addFirst(item);
		}else {
				Node new_node = new Node();
				new_node.val = item;
				tail.next = new_node;
				tail = new_node;
				this.size++;
			
			  }
	}
	
	public int getFirst() throws Exception 
	{
		if(size == 0) 
		{
			throw new Exception("Nothing is there so can't return any value ");
		}
		return Head.val;
	}

	public int getLast() throws Exception 
	{
		if(size == 0) 
		{
			throw new Exception("Nothing is there so can't return any value ");
		}
		return tail.val;
	}

	public Node GetNode(int k) throws Exception {

		if (k < 0 || k >= size) {
			throw new Exception("Index Valid dedo bklol");
		}
		Node temp = Head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("BkLol is Linked empty hai");
		}
		Node temp = Head;
		Head = Head.next;
		if (size == 1) {
			tail = null;
		}
		size--;
		temp.next = null;
		return temp.val;

	}

	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("LinkedList is Empty");
		}
		if (size == 1) {
			return removefirst();

		} else {
			Node n = GetNode(size - 2);
			Node temp = tail;
			tail = n;
			tail.next = null;
			size--;
			return temp.val;

		}
	}

	public void display() 
	{
		Node temp = Head;
		while(temp != null) 
		{
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println(".");
	}
}



