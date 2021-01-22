// Correct element for first place

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		selectionSort(a,n);
		sc.close();
	}

	private static void selectionSort(int[] a, int n) {
		// TODO Auto-generated method stub
		int i=0, min=0, temp=0;
		for(i=0;i<n-1;i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min = j;
			}
			
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	

}
