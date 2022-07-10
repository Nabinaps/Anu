package looping;

import java.util.Scanner;

public class MainPower 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n and p");
		int n=sc.nextInt();
		int p =sc.nextInt();
		int res=1;
		while(p>0)
		{
			res=res*n;
			p--;
		}
		System.out.println(res);
	}
}
