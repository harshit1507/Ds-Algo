import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		quickSort(a,0,n-1);
		for(int i : a)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

	private static void quickSort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if(low>=high)
			return;
		
		int pivot = partition(a,low,high);
		quickSort(a,low,pivot-1);
		quickSort(a,pivot+1,high);
	}

	private static int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = a[high];
		int i = low-1, temp=0;
		for(int j = low; j<=high-1; j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	}

}
