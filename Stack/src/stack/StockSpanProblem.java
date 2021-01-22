package stack;

import java.util.*;
public class StockSpanProblem {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int span[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		StackLinkedList stack = new StackLinkedList();
		stack.push(0);
		span[0] = 1;
		
		for(int i=1;i<n;i++)
		{
			while(!stack.isEmpty() && a[stack.top()] <= a[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
				span[i] = i+1;
			else
				span[i] = i - stack.top();
			
			stack.push(i);
		}
		
		for(int i=0;i<n;i++)
			System.out.print(span[i]+" ");
		System.out.println();
		
		sc.close();
	}
}
