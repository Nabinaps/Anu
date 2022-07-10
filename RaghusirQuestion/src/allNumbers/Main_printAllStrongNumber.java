package allNumbers;

import java.util.Scanner;

public class Main_printAllStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int sum=0;
			int temp=i;
			int k=i;
			while(k>0)
			{
				int digit=k%10;
				sum=sum+fact(digit);
				k=k/10;
			}
			if(sum==temp)
				System.out.println(temp);
		}
	}

	private static int fact(int x) 
	{
		int f=1;
		while(x>0)
		{
			f=f*x;
			x--;
		}
		return f;
	}
}
