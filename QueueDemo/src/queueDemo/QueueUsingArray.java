package queueDemo;

public class QueueUsingArray {
	private static int front, rear, capacity; 
    private static int queue[]; 
	
	QueueUsingArray(int c)
	{
		front = rear = 0; 
        capacity = c; 
        queue = new int[capacity]; 
	}
	public void enqueue(int data)
	{
		if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
		else
		{
			queue[rear] = data; 
			if(front == -1)
				front = rear;
			rear++;
		}
		return;
	}
	
	public void dequeue()
	{
		int temp;
		if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
		else
		{ 
			// shift all the elements from index 2 till rear 
	        // to the right by one 
			for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
            // store 0 at rear indicating there's no element 
            if (rear < capacity) 
                queue[rear] = 0; 
  
            // decrement rear 
            rear--; 
		}
		return;
	}
	
	public void printQueue()
	{
		int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d ", queue[i]); 
        } 
        return; 
	}
	
	static void queueFront() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return; 
    } 
}
