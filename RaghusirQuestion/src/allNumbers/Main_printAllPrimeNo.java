package allNumbers;

import java.util.Scanner;

public class Main_printAllPrimeNo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("Prime numbers within "+n+" is");
		for(int i=0;i<=n;i++)
		{
			boolean prime=isPrime(i);
			if(prime==true)	
				System.out.println(i);
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
