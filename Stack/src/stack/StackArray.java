package stack;

public class StackArray {
	
	int top = -1;
	int max = 1000;
	int stack[] = new int[max];
	
	boolean isFull()
	{
		if(top == (max-1)) 
		{			
			return true;
		}
		return false;
	}
	
	boolean push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
			return false;
		}
			
		
		stack[++top] = data;
		return true;
			
	}
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
		return false;
	}
	
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		
		int data = stack[top];
		top--;
		return data;
	}
}
