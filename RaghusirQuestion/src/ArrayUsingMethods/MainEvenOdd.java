package ArrayUsingMethods;

import java.util.Scanner;

public class MainEvenOdd {
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
		int c[]=count(a);
		System.out.println("even number present is "+c[0]);
		System.out.println("odd number present is "+c[1]);
	}
	static int[] count(int x[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				even++;
			else
				odd++;
		}
		int countEO[]= {even,odd};
		return countEO;
	}
}
