package SingleAndDoublyLinkedList;

public class DLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insertAtBeg(4);
		dll.insertAtBeg(5);
		dll.insertAtEnd(8);
		dll.printList();
		dll.insertAfter(4,6);
		dll.printList();
		dll.delete(8);
		dll.printList();
		dll.reverse();
		dll.printList();
	}

}
