package allNumbers;

import java.util.Scanner;

// a number (such as 16461) that
//remains the same when its digits are reversed
public class Main_checkPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int k=n;
		while(k>0)
		{
			int rev=k%10;
			sum=sum*10+rev;
			k=k/10;
		}
		if(sum==n)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not a palindrome");
		
	}
}
