import java.util.Scanner;

public class OrderedLinearSearch {

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
		for(int i=0;i<length;i++)
		{
			if(arr[i]==data)
				return i;
			if(arr[i]>data)
					return -1;
		}
		return -1;
	}

}
