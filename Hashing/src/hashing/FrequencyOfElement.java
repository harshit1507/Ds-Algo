package hashing;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,3,2,2,3,10,9,10,5,5,10,9};
		int freq[] = new int[15];
		
		for(int i=0;i<15;i++)
		{
			freq[arr[i]]++;
		}
		for(int i=0;i<15;i++)
		{
			if(freq[i] != 0)
			{
				System.out.println("Frequency of "+i+" is "+freq[i]);
			}
		}
	}

}
