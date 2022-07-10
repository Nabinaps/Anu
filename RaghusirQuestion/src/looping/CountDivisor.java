package looping;

import java.util.Scanner;

public class CountDivisor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int d=getDivisor(n);
		System.out.println("number of divisor is "+d);
	}
	static int getDivisor(int x)
	{
			int div=1;
			for(int i=1;i<=x/2;i++)
			{
				if(x%i==0)
					div++;	
			}
			return div;
	}
	
}
