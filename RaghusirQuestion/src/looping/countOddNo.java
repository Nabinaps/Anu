package looping;

import java.util.Scanner;

public class countOddNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int a=getOddNo(n);
		System.out.println("number of odd number is "+a);
	}
	static int getOddNo(int x)
	{
		int s=0;
		for(int i=1;i<=x;i++)
		{
			if(i%2!=0)
				s++;
		}
		return s;
	}
}
