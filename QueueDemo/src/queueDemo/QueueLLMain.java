package queueDemo;

public class QueueLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL queue = new QueueUsingLL();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
