package ArrayUsingMethods;

import java.util.Scanner;

public class MainCountPrime 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=count(a);
		System.out.println("no of prime number is "+count);
	}

	private static int count(int[] a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			boolean rs=isPrime(a[i]);
			if(rs==true)
				c++;
		}
		return c;
	}

	private static boolean isPrime(int x) 
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;
		}
		
		return true;
	}
}
