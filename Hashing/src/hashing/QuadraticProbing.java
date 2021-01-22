package hashing;

import java.util.Scanner;

public class QuadraticProbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		QHashTableSlot hashTable = new QHashTableSlot(n);
		for(int i=0;i<8;i++)
		{
			int key = sc.nextInt();
			int value = sc.nextInt();
			hashTable.insert(key, value);
		}
		hashTable.display();
		if(hashTable.searchElement(25))
			System.out.println("Key 25 is present");
		else
			System.out.println("Key 25 is not present");
		System.out.println(hashTable.getSize());
		hashTable.clear();
		System.out.println(hashTable.getSize());
		sc.close();
	}

}

class QHashSlots
{
	int key;
	int value;
	
	QHashSlots(int key, int value)
	{
		this.key = key;
		this.value = value;
	}
}

class QHashTableSlot
{
	private int size, TABLE_SIZE;
	private QHashSlots table[];
	
	public QHashTableSlot(int capacity)
	{
		size = 0;
		TABLE_SIZE = capacity;
		table  = new QHashSlots[TABLE_SIZE];
		for(int i=0;i<TABLE_SIZE;i++)
			table[i] = null;
	}
	
//	Function to get number of key-value pairs
	public int getSize()
	{
		return size;
	}
	
//	Function to clear Hash Table
	public void clear()
	{
		for(int i=0;i<TABLE_SIZE;i++)
			table[i] = null;
		size = 0;
	}
	
//	Function to insert key-value pairs
	public void insert(int key, int value)
	{
		int index = key % TABLE_SIZE;
		int i = index;
		int p=1;
		do
		{
			if(table[i] == null)
			{
				table[i] = new QHashSlots(key,value);
				size++;
				return;
			}
			if(table[i].key == key)
			{
				System.out.println("Duplicate keys are not allower\n");
				return;
			}
			 
			i = (index + (p*p)) % TABLE_SIZE;
			p++;
		}
		while( i != index);
		
		System.out.println("Hashtable is full\n");
	}
	
//	Search Function
	boolean searchElement(int key)
	{
		int index = key % TABLE_SIZE;
		int i = index;
		int p=1;
		do
		{
			if(table[i] == null)
				return false;
			if(table[i].key == key)
				return true;
			i = (index + (p*p)) % TABLE_SIZE;
			p++;
		}
		while(i != index);
		return false;
	}
	
//	Display Function
	void display()
	{
		for(int i=0;i<TABLE_SIZE;i++)
		{
			if(table[i] == null)
				System.out.println("HashTable ["+i+"] has no element");
			else
			{
				System.out.println("HashTable ["+i+"] has elements:- ");
				System.out.println("[key = "+table[i].key+", value = "+table[i].value+"]");
			}
		}
	}
}
