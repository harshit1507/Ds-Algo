package stack;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class StackLinkedList {

	Node head = null;
	int top = -1;
	
	void push(int data)
	{
		Node newNode = new Node(data);
		top++;
		if(head == null)
		{
			head = newNode;
		}
		
		newNode.next = head;
		head = newNode;	
	}
	
	int pop()
	{
		if(head == null) 
		{
			System.out.println("Stack is Empty.");
			return -1;
		}
		int data = head.data;
		head = head.next;
		top--;
		return data;
	}
	
	boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
	
	int top()
	{
		return head.data;
	}
}
