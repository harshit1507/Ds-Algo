package hashing;
import java.util.*;
import java.util.Scanner;

public class SameSetOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			int brr[] = new int [n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			for(int i=0;i<n;i++)
				brr[i] = sc.nextInt();
			
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i=0;i<n;i++)
			{
				if(map.get(arr[i]) == null)
					map.put(arr[i], 1);
				else
					map.put(arr[i], map.get(arr[i])+1);
			}
			
			boolean flag = true;
			for(int i=0;i<n;i++)
			{
				// If there is an element in brr[], but not in arr[]
				if(!map.containsKey(brr[i]))
				{
					flag = false;
					break;
				}
				
				// If an element of brr[] appears more times than it appears in arr[]
				if(map.get(brr[i]) == 0)
				{
					flag = false;
					break;
				}
				map.put(brr[i], map.get(brr[i])-1);
			}
			
			if(flag)
				System.out.println("Both arrays have same set of numbers");
			else
				System.out.println("Both arrays have different set of numbers");
		}
		
		sc.close();
	}

}
