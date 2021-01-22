package hashing;

import java.util.Arrays;

public class Collisions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11, 141, 156, 66, 296, 752};
		int hash[] = new int[11];
		
		Arrays.fill(hash,-1);
		for(int i=0;i<6;i++)
			hash[arr[i]%11] = arr[i];
		
		for(int i=0;i<11;i++)
		{
			if(hash[i] != -1)
				System.out.println("Element present at slot index "+i+" is "+hash[i]);
		}
		
//		if(hash[300%10] == -1)
//			System.out.println("False");
//		else
//			System.out.println(hash[300%10]);
	}

}
