package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArray stackArray = new StackArray();
		stackArray.push(1);
		stackArray.push(2);
		stackArray.push(3);
		
		int data = stackArray.pop();
		System.out.println("Popped Element: "+data);
		
		data = stackArray.pop();
		System.out.println("Popped Element: "+data);
	}

}
