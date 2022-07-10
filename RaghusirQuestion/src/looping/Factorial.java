package looping;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int f=Fact(n);
	
		System.out.println("factorial on "+n+" is "+f);
	}
		static int Fact(int n) 
		{
			int res=1;
			while(n>1)
			{
				res=res*n; 
				n--;
			}
				return res;
		}
	
}
