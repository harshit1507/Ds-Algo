//	Correct element for last position

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		bubbleSort(a,n);
		sc.close();
	}

	private static void bubbleSort(int[] a, int n) {
		// TODO Auto-generated method stub
		int swapped = 0;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = 1;
				}
			}
			if(swapped ==0)
			{	
				break;				
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
