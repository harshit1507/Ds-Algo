package hashing;

import java.util.Scanner;

public class DirectAddressing {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashTable hashTable = new HashTable(n);
		for(int i=0;i<n;i++)
		{
			int key = sc.nextInt();
			int value = sc.nextInt();
			hashTable.insert(key, value);
		}
		hashTable.printHashTable();
		System.out.println(hashTable.getValue(1000));
		System.out.println(hashTable.getSize());
		hashTable.clear();
		System.out.println(hashTable.getSize());
		
		sc.close();
	}
	
}

class LinkedHash
{
	int key;
	int value;
	LinkedHash next;
	
//	Constructor
	LinkedHash(int key, int value)
	{
		this.key = key;
		this.value = value;
		this.next = null;
	}
}

class HashTable
{
	private int TABLE_SIZE;
	private int size;
	private LinkedHash table[];
	
//	Constructor
	public HashTable(int capacity)
	{
		size = 0;
		TABLE_SIZE =capacity;
		table = new LinkedHash[TABLE_SIZE];
		for(int i=0;i<TABLE_SIZE;i++)
			table[i] = null;
	}
	
//	Function to get number of key-value pairs
	public int getSize()
	{
		return size;
	}
	
//	Function to clear hash table
	public void clear()
	{
		for(int i=0;i<TABLE_SIZE;i++)
			table[i] = null;
	
		size = 0;
	}
	
//	Function to get value of a key
	public int getValue(int key)
	{
		int hash = (key % TABLE_SIZE);
		if(table[hash] == null)
			return -1;
		else
		{
			LinkedHash entry = table[hash];
			while(entry != null && !(entry.key == key))
				entry = entry.next;
			if(entry == null)
				return -1;
			
			return entry.value;
		}
	}
	
//	Function to insert a key value pair
	public void insert(int key, int value)
	{
		int hash = (key % TABLE_SIZE);
		if(table[hash] == null)
			table[hash] = new LinkedHash(key, value);
		else
		{
			LinkedHash entry = table[hash];
			while(entry.next != null)
				entry = entry.next;
			if(entry.key == key)
			{
				System.out.println("Duplicate keys are not allowed.");
				return;
			}
				
			else
				entry.next = new LinkedHash(key, value);
		}
		size++;
	}
	
//	Function to print hash table
	public void printHashTable()
	{
		for(int i=0;i<TABLE_SIZE;i++)
		{
			System.out.println("\nBucket "+ (i + 1) +" : ");
			LinkedHash  entry = table[i];
			while(entry != null)
			{
				System.out.println("[Key = "+entry.key+", value = "+entry.value+"]");
				entry= entry.next;
			}
		}
	}
}
