package loopingDOwhile;

import java.util.Scanner;

public class SumOfPrime 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int S=sumofprime(n);
		System.out.println("sum of the prime number within "+n+" is "+S);
	}
	static int sumofprime(int x)
	{
		int sum=0;
		int d=getDivisor(x);
		do {
			if(d==2)
				sum=sum+x;
			x--;
				
		}while(x>0);
		return sum;
		
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
