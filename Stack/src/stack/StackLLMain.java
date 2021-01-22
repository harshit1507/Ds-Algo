package stack;

public class StackLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackLinkedList stackList = new StackLinkedList();
		stackList.push(3);
		stackList.push(2);
		stackList.push(1);
		
		int data = stackList.pop();
		System.out.println("Popped Element: "+data);
		
		data = stackList.pop();
		System.out.println("Popped Element: "+data);
	}

}
