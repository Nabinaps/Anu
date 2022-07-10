package ArrayUsingMethods;

import java.util.Scanner;

public class Main_MergeTwoShortedArrayInShortedOrder 
{
	public static void main(String[] args) {
		System.out.println("read 1st array");
		int a[]=readArray();
		display(a);
		System.out.println("\n read 2nd array");
		int b[]=readArray();
		display(b);
		int c[]=merge(a,b);
		System.out.println("\n after merge");
		display(c);
	}
	private static int[] merge(int[] a, int[] b) 
	{
		int x[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				x[k++]=a[i++];
			else
				x[k++]=b[j++];
		}
		while(i<a.length)
		{
			x[k++]=a[i++];
		}
		while(j<b.length)
		{
			x[k++]=b[j++];
		}
		return x;
	}
	private static void display(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	private static int[] readArray() 
	{
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
}
