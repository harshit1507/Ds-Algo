import java.util.Scanner;

public class FirstOccuranceOfIndexOf1 {

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
			System.out.println(firstIndex(a,0,n-1));
		}
		sc.close();
	}

	private static int firstIndex(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end)
			return -1;
		int mid = start +(end-start)/2;
		if(a[mid]==1 && (mid==0 || a[mid-1]==0))
			return mid;
		else if(a[mid]==0)
			return firstIndex(a,mid+1,end);
		else
			return firstIndex(a,start,mid-1);
	}

}
