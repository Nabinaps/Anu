package ArrayUsingMethods;

import java.util.Scanner;

public class MainReverseArray {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the values of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("user entered array");
		display(a);
		reverse(a);
		System.out.println("\n after reverse");
		display(a);
	}
	private static void reverse(int[] a) {
		int i=0,j=a.length-1;
		while(i<j)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
		
	}
	static void display(int []x)
	{
		for(int i=0;i<x.length;i++)
			System.out.print(x[i]+" ");
	}
}
