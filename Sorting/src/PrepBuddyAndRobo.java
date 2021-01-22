import java.util.Arrays;
import java.util.Scanner;

public class PrepBuddyAndRobo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int num = n;
			int count=0;
			while(num!=0)
			{
				count++;
				num/=10;
			}
			int a[] = new int[count];
			for(int i=0;i<count;i++)
			{
				a[i] = n%10;
				n/=10;
			}
			Arrays.sort(a);
			int flag=0;
			for(int i=0;i<count-1;i++)
			{
				if(a[i+1] != a[i] + 1)
				{
					flag=1;
					break;
				}				
			}
			if(flag==0)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		sc.close();
	}

}




