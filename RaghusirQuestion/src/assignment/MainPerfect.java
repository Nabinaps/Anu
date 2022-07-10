package assignment;

import java.util.Scanner;

public class MainPerfect 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			boolean per=isPerfect(i);
			if(per==true)
				{
					sum=sum+i;
					System.out.println(i);
				}
		}
		System.out.println(sum);
	}
	static boolean isPerfect(int x)
	{
		int sum=0,temp=x;
			for(int i=1;i<=x/2;i++)
			{
				if(x%i==0)
					{
						sum=sum+i;
					}
			}
		return sum==temp;
	}
}
