package SingleAndDoublyLinkedList;

class NodeDLL
{
	int data;
	NodeDLL next;
	NodeDLL prev;
	
	NodeDLL(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {
	
	NodeDLL head = null;
	
	void insertAtBeg(int data)
	{
		NodeDLL newNode = new NodeDLL(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
			
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	void insertAfter(int num, int data)
	{
		NodeDLL tempNode = head;
		NodeDLL newNode = new NodeDLL(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		while(tempNode != null && tempNode.data != num)
			tempNode = tempNode.next;
		
		if(tempNode == null)
		{
			System.out.println("Element "+num+" not found, insertion is unsuccessfull.");
			return;
		}
		
		newNode.next = tempNode.next;
		newNode.prev = tempNode;
		tempNode.next = newNode;
		if(newNode.next != null)
			newNode.next.prev = newNode;
	}
	
	void insertAtEnd(int data)
	{
		NodeDLL newNode = new NodeDLL(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		NodeDLL tempNode = head;
		while(tempNode.next != null)
			tempNode = tempNode.next;
		
		tempNode.next = newNode;
		newNode.prev = tempNode;
	}
	
	void delete(int num)
	{
		if(head == null)
		{
			System.out.println("List is Empty, can't delete from an Empty list.");
			return;
		}
		
		NodeDLL delNode = head;
		while(delNode != null && delNode.data != num)
			delNode = delNode.next;
		
		if(delNode == head)
		{
			head = head.next;
			head.prev = null;
			return;
		}
		
		delNode.prev.next = delNode.next;
		if(delNode.next != null)
			delNode.next.prev = delNode.prev;
	}
	
	void reverse()
	{
		NodeDLL temp = null, current = head;
		while(current != null)
		{
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		
		if(temp != null)		// runtime error check if list has only single element because temp (previous element) of single element is null and null.prev gives runtime exception
			head = temp.prev;
	}
	
	void printList()
	{
		NodeDLL tempNode = head;
		
		while(tempNode != null)
		{
			System.out.print(tempNode.data+" ");
			tempNode = tempNode.next;
		}			
		System.out.println();
	}
}
