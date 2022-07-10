package allNumbers;

import java.util.Scanner;

//a positive integer that is equal to the sum of its proper divisors
public class Main_checkPerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
			
	}
}
