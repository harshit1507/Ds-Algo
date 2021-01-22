import java.util.Scanner;

public class BinarySearchInSortedAndRotatedArray {

	static int binarySearch(int a[], int start, int end, int key)
	{
		if(start>end)
			return -1;
		int mid = start + (end - start)/2;
		if(key == a[mid])
			return mid;
		if(key>a[mid])
			return binarySearch(a,mid+1,end,key);
		return binarySearch(a,start,mid-1,key);
	}
	
	static int findPivot(int a[], int start, int end)
	{
		if(start>end)
			return -1;
		int mid = start + (end - start)/2;
		if(mid<end && a[mid]>a[mid+1])
			return mid+1;
		if(mid>start && a[mid] <a[mid-1])
			return mid;
		if(a[mid]<a[start])
			return findPivot(a,start,mid-1);
		return findPivot(a,mid+1,end);
	}
	
	static int findKey(int a[], int n, int key)
	{
		int pivot = findPivot(a,0,n-1);
		if(pivot == -1)
			return binarySearch(a,0,n-1,key);
		if(a[pivot] == key)
			return pivot;
		if(a[0]<key)
			return binarySearch(a,0,pivot-1,key);
		return binarySearch(a,pivot+1,n-1,key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int key = sc.nextInt();
			System.out.println(findKey(a,n,key));
		}
		sc.close();
	}

}
