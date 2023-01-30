package linked_list;

public class linked_list_cycle {

		class Node
		{
			int val;
			Node next;
		
		Node(int x)
			{
				val = x;
				next = null;
			}
		}
		
	public class solution 
	{
		public boolean HasCycle(Node head) 
		{
			Node slow = head;
			Node fast = head;
			if(fast != null && slow != null) 
			{
				slow = head.next;
				fast = head.next.next;
				if(slow == fast) 
				{	
					System.out.println("Not a cyclle ");
					return false;
				}
			}
			return true;
		}
	}
	
}
