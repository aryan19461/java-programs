package linked_list;

public class merge_two_sorted_list {
	
	public class Node
	{
		int val ;
		Node next;
		
		Node()
		{
			
		}
		Node(int item)
		{
			val = item;
		}
		Node(int item , Node next)
		{
			val = item;
			this.next = next;
		}
		
	}
	class Solution
	{
		public Node mergeList(Node List1 , Node List2) 
		{
			Node Dummy = new Node();
			Node temp = Dummy;
			
			while(List1 != null && List2 != null ) 
			{
				if(List1.val <List2.val) 
				{
					Dummy.next = List1;
					Dummy = Dummy.next;
					List1 = List1.next;
				}else 
				{
					Dummy.next = List2;
					Dummy = Dummy.next;
					List2 = List2.next;
				}
				
			}
			if(List1 == null) 
			{
				Dummy.next = List1;
			}
			if(List2 == null) 
			{
				Dummy.next = List2;
			}
			return temp.next;
		}
	}
}
