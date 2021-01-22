package SingleAndDoublyLinkedList;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
//		list.insertAtBeg(1);
//		list.insertAtEnd(2);
//		list.insertAtEnd(3);
//		list.insert(3,4);
//		list.printList();
//		list.delete(8);
//		list.printList();
//		list.reverse();
//		list.printList();
		
		int listCount = sc.nextInt();
		for(int i=0;i<listCount;i++)
		{
			int listItem = sc.nextInt();
			list.insertAtEnd(listItem);
		}
		
//		list.rearrange();
//		list.head.next.next.next.next = list.head.next.next.next;		// creating artificial cycle
		
//		boolean res = findFloydCycle(list.head);
//		if(res)
//			System.out.println("Cycle Found");
//		else
//			System.out.println("Cycle Not Found");
//		
		
		list.rearrange();
		
		
		list.printList();
		sc.close();
	}
	
	static boolean findFloydCycle(Node head)
	{
		Node slow = head, fast = head;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}

}
