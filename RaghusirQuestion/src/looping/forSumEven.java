package looping;

import java.util.Scanner;

public class forSumEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int sum=getSum(n);
		System.out.println("sum of even number is"+sum);
	}
	static int getSum(int x)
	{
		int s=0;
		for(int i=1;i<=x;i++)
		{
			if(i%2==0)
				s=s+i;
		}
		return s;
	}
}
