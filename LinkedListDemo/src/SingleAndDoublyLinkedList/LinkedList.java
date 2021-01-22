package SingleAndDoublyLinkedList;

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
public class LinkedList 
{
	Node head = null;
	void insertAtBeg(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	void insert(int num, int data)
	{
		Node tempNode = head;
		while(tempNode!=null && tempNode.data != num)
			tempNode = tempNode.next;
		if(tempNode == null)
		{
			System.out.println("Element "+num+" not found, insertion is unsuccessfull.");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	
	void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node tempNode = head;
			while(tempNode.next != null)
				tempNode = tempNode.next;
			
			tempNode.next = newNode;
		}
		
	}
	
	void delete(int num)
	{
		Node currentNode = head;
		Node prevNode = null;
		while(currentNode != null && currentNode.data != num)
		{
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
			
		
		if(currentNode == head)
		{
			if(head == null)
			{
				System.out.println("List is Empty, can't delete from empty list");
				return;
			}
			
			head = head.next;	// if list is not empty
			return;
		}
		if(currentNode == null)
		{
			System.out.println("Element "+num+" not found.");
			return;
		}
		prevNode.next = currentNode.next;	// delete any node from between nodes and can also deletes last node
		
	}
	
	void reverse()
	{
		Node current = head, prev = null, next = null;
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
	void printList()
	{
		Node tempNode = head;
		while(tempNode != null)
		{
			System.out.print(tempNode.data+" ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
	
	void rearrange()
	{
		Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null, currentNode = head;
		
		while(currentNode != null)
		{
			int element = currentNode.data;
			
			if(element % 2 == 0)
			{
				if(evenStart == null)
				{
					evenStart = currentNode;
					evenEnd = evenStart;
				}
				else
				{
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}
			else
			{
				if(oddStart == null)
				{
					oddStart = currentNode;
					oddEnd = oddStart;
				}
				else
				{
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			
			currentNode = currentNode.next;
		}
		
		if(oddStart == null || evenStart == null)
			return;
		
		Node current = evenStart, prev = null, next = null;
		evenEnd.next = null;
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		evenStart = prev;
		
		oddEnd.next = evenStart;
//		evenEnd.next = null;
		head = oddStart;
	}
}
