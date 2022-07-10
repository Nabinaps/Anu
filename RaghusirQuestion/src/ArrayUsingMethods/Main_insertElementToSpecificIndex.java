package ArrayUsingMethods;

import java.util.Scanner;

public class Main_insertElementToSpecificIndex 
{
	public static void main(String[] args) {
		System.out.println("read the array");
		int a[]=readArray();
		System.out.println("user enter array");
		display(a);
		a=insert(a,39,2);
		System.out.println("after insert");
		display(a);
	}
	private static int[] insert(int[] a, int b, int c) 
	{
		if(c<0||c>a.length)
		{
			System.out.println("not possible");
			return a;
		}
		else
		{
			int ar[]=new int[a.length+1];
			ar[c]=b;
			for(int i=0;i<a.length;i++)
			{
				if(i<c)
				ar[i]=a[i];
				else
					ar[i+1]=a[i];
			}
		return ar;
		}
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
