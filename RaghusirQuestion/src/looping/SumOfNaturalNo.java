package looping;

import java.util.Scanner;

public class SumOfNaturalNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n and p");
		int n=sc.nextInt();
		int sum=GetSum(n);
	}
		static int GetSum(int n)
		{
			int s=0;
			while(n>0)
			{
				s=s+n;
				n--;
			}
			return s;
		}
	
}
