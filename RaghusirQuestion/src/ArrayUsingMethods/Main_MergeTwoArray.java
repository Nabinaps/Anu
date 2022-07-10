package ArrayUsingMethods;

import java.util.Scanner;

public class Main_MergeTwoArray 
{
	public static void main(String[] args) {
		System.out.println("read first array");
		int a[]=readArray();
		System.out.println("read the second arry");
		int b[]=readArray();
		System.out.println("first array is");
		display(a);
		System.out.println("\n second array is");
		display(b);
		int c[]=merge(a,b);
		System.out.println("\n after merge");
		display(c);
	}

	private static int[] merge(int[] a, int[] b) 
	{
		int x[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			x[i+a.length]=b[i];
		}
			
		return x;
	}

	private static void display(int[] c) {
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

	private static int[] readArray() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(("enter the size of array"));
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
