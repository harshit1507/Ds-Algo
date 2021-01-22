import java.util.Scanner;

public class MergeSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
//		int a[] = {1,7,6,8,0,9,4,5};
		mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

	private static void mergeSort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		if(left>=right)
			return;
		
		int mid = left + (right - left)/2;
		mergeSort(a,left,mid);
		mergeSort(a,mid+1,right);
		Merge(a, left, mid, right);
	}

	private static void Merge(int[] a, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1 = mid - left +1, n2 = right - mid;
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftArr[i] = a[left + i];
		}
		for(int i=0;i<n2;i++)
		{
			rightArr[i] = a[mid+i+1];
		}
		int i=0;
		int j=0;
		int k=left;
		while(i<n1 && j<n2)
		{
			if(leftArr[i] <= rightArr[j])
				a[k++] = leftArr[i++];
			else
				a[k++] = rightArr[j++];
		}
		
		while(i<n1)
			a[k++] = leftArr[i++];
		
		while(j<n2)
			a[k++] = rightArr[j++]; 
	}

}
