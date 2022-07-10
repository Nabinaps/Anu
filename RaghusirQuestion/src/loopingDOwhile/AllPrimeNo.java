package loopingDOwhile;

import java.util.Scanner;

public class AllPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean prime=isPrime(i);
			if(prime==true)
				System.out.println(i+" is a prime number");
		}		
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
