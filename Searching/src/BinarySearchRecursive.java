import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int low = 0;
		int high = arr.length - 1;
		System.out.println(findElement(arr,low,high,data));
		sc.close();
	}

	private static int findElement(int[] arr, int low, int high, int data) {
		// TODO Auto-generated method stub
		if(low>high)
			return -1;
		int mid = low + (high - low)/2;
		if(arr[mid]==data)
			return mid;
		else if(arr[mid]>data)
			return findElement(arr,low,mid-1,data);
		else
			return findElement(arr,mid+1,high,data);
	}

}
