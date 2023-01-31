package stack_queue;

public class queue_front {

	public static void main(String[] args) throws Exception {
		
		queue q = new queue();
		q.getFront();
/*
Exception in thread "main" java.lang.Exception: Nothing to show...  		
*/	
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.Display();
		System.out.println(q.dequeue());
		q.Display();
	}

}
