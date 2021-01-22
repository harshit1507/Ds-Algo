package stack;

import java.util.Scanner;

public class TwoStacksUsingSingleArray {

	static class StackArray1
	{
		public int size;
		public int top1,top2;
		public int arr[];
		
		StackArray1(int n)
		{
			arr = new int[n];
			size = n;
			top1 = -1;
			top2 = size;
		}
		
		void push1(int data)
		{
			if(top1 < top2 - 1) {
				arr[++top1] = data;
			}
			else
				System.out.println("Stack1 Overflow");
		}
		
		void push2(int data)
		{
			if(top1 < top2 - 1) {
				arr[--top2] = data;
			}
			else
				System.out.println("Stack2 Overflow");
		}
		
		void pop1()
		{
			if(top1 > -1)
			{
				int poppedElement = arr[top1--];
				System.out.println("Popped Element: "+poppedElement);
			}
			else
			{
				System.out.println("Stack1 Underflow");
			}
		}
		
		void pop2()
		{
			if(top2 < size)
			{
				int poppedElement = arr[top2++];
				System.out.println("Popped Element: "+poppedElement);
			}
			else
			{
				System.out.println("Stack2 Underflow");
			}
		}
		
		void print1()
		{
			for(int i=top1;i>=0;i--)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		
		void print2()
		{
			for(int i=top2;i<size;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StackArray1 sa = new StackArray1(n);
		int stack1 = sc.nextInt();
		int stack2 = sc.nextInt();
		int ele;
		for(int i=0;i<stack1;i++)
		{
			ele = sc.nextInt();
			sa.push1(ele);
		}
		for(int i=0;i<stack2;i++)
		{
			ele = sc.nextInt();
			sa.push2(ele);
		}
		
		System.out.println("Stack1: ");
		sa.print1();
		System.out.println("Stack2: ");
		sa.print2();
		
		sa.push1(15);;
		int num = sa.top1+1;
		while(num!=0)
		{
			sa.pop1();
			num--;
		}
		sa.pop1();
		
		sc.close();
	}

}
