import java.util.Arrays;
import java.util.Scanner;
public class GoogleKickStartRoundA2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int caseno = 1;
		while(caseno<=t)
		{
			int n = sc.nextInt();
			int p = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			System.out.println("Case #"+(caseno++)+" : "+MinHours(a,n,p));
		}
		sc.close();
	}

	private static long MinHours(int[] a, int n, int p) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		int pa[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			pa[i+1] = pa[i] + a[i];
		}
		long result = Long.MAX_VALUE;
		for(int j=p-1;j<n;j++)
		{
			long currentSum = pa[j] - pa[j-(p-1)];
			long finalHours = a[j]*(p-1) - currentSum;
			result = Math.min(result, finalHours);
		}
		return result;
	}

}




