package looping;

import java.util.Scanner;

public class avgDivisor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		float d=getAverage(n);
		System.out.println("number of divisor is "+d);
	}
	static float getAverage(int x)
	{
			float div=1;
			float sum=x;
			for(int i=1;i<=x/2;i++)
			{
				if(x%i==0)
				{
					div++;
					sum=sum+i;
				}
					
			}
			float avg=sum/div;
			return avg;
	}
	
}
