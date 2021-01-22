// Linear Algorithm --> Stable, Non Comparison Based Algo
// Right position for the particular element

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		countingSort(a,n,max);
		for(int i : a)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

	private static void countingSort(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		int c[] = new int[k+1];
		int b[] = new int[n];
		
		Arrays.fill(c, 0);
		for(int i=0;i<n;i++)
		{
			c[a[i]] = c[a[i]] + 1;
		}
		for(int i=1;i<=k;i++)
		{
			c[i] = c[i] + c[i-1];
		}
		for(int i = n-1; i>=0; i--)
		{
			b[c[a[i]]-1] = a[i];
			c[a[i]]--;
		}
		for(int i=0;i<n;i++)
		{
			a[i] = b[i];
		}
	}

}
