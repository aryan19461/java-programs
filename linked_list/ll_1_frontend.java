/*
30 -> 20 -> 10 -> .
30 -> 20 -> 10 -> 9 -> 8 -> 7 -> .
First item is = 30
Last item is = 7
  
*/

package linked_list;
import java.util.*;
public class ll_1_frontend {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.display();

		ll.addLast(9);
		ll.addLast(8);
		ll.addLast(7);
		ll.display();
		System.out.println("First item is = " + ll.getFirst());
		System.out.println("Last item is = " + ll.getLast());
		System.out.println();
		System.out.println("Taking input using loop = ");
		for (int i = 0; i < 5; i++) 
		{
			ll.addLast(sc.nextInt());
		}
		ll.display();
		
		
	}

}
