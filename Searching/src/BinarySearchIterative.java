import java.util.Scanner;

public class BinarySearchIterative {

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
		System.out.println(findElement(arr,arr.length,data));
		sc.close();
	}

	private static int findElement(int[] arr, int length, int data) {
		// TODO Auto-generated method stub
		int low =0;
		int high = length-1;
		while(low<=high)
		{
			int mid = low + (high - low)/2;
			if(arr[mid]==data)
				return mid;
			else if(arr[mid]<data)			
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

}
