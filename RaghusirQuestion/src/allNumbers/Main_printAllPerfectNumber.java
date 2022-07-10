package allNumbers;

import java.util.Scanner;

public class Main_printAllPerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("all perfect number within "+n+" is");
		for(int i=0;i<=n;i++)
		{
			boolean perfect=isPerfect(i);
			if(perfect)
				System.out.println(i);
		}
			
	}

	private static boolean isPerfect(int x) 
	{
		int sum=0;
	for(int i=1;i<=x/2;i++)
	{
		if(x%i==0)
			sum=sum+i;
	}
	if(sum==x)
		return true;
	
		return false;
	}
}
