package queueDemo;

public class QueueArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a queue of capacity 4 
        QueueUsingArray q = new QueueUsingArray(4); 
  
        // print Queue elements 
        q.printQueue(); 
  
        // inserting elements in the queue 
        q.enqueue(20); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
  
        // print Queue elements 
        q.printQueue(); 
  
        // insert element in the queue 
        q.enqueue(60); 
  
        // print Queue elements 
        q.printQueue(); 
  
        q.dequeue(); 
        q.dequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 
  
        // print Queue elements 
        q.printQueue(); 
  
        // print front of the queue 
        q.queueFront(); 
	}

}
