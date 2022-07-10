package loopingDOwhile;

import java.util.Scanner;

public class AllPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			int sum=0;
			int k=i;
			while(k>0)
			{ 
				int rev=k%10;
				sum=sum*10+rev;
				k=k/10;
			}
			if(sum==temp)
			{
				System.out.println(temp+" is palindrome");
			}
		}
		
	}

}
