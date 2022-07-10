package allNumbers;

import java.util.Scanner;

public class Main_printAllPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("all palindrome within "+n+" is");
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			int k=i;
			while(k>0)
			{ 
				int rev=k%10;
				sum=sum*10+rev;
				k=k/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		
	}
}
