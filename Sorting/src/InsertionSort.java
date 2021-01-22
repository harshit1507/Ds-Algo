// Correct place for an element

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		insertionSort(a,n);
		sc.close();
	}

	private static void insertionSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<n;i++)
		{
			int v = a[i];
			int j=i;
			while(j>0 && a[j-1] > v)
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = v;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	

}
