package ArrayUsingMethods;

import java.util.Scanner;

public class MainSumOfElements {
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
		int b=getSum(a);
		System.out.println("sum of the elements is "+b);
	}

	private static int getSum(int[] a) 
	{
		int b=a[0];
		for(int i=1;i<a.length;i++)
		{
			b=b+a[i];
		}
		return b;
	}
}
