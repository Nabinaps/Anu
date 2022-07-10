package allNumbers;

import java.util.Scanner;

public class Main_printAllDisariumNumber {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("disarium numbers within "+n+" is");
		for(int i=0;i<=n;i++)
		{
			int digit=countDigit(i);
			int k=i;
			int sum=0;
			while(k>0)
			{
				int d=k%10;
				sum=sum+pow(digit,d);
				digit--;
				k=k/10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
	private static int pow(int digit, int d)
	{
		int power=1;
		while(digit>0)
		{
			power=power*d;
			digit--;
		}
		//System.out.println(power);
		return power;
		
	}

	private static int countDigit(int a) 
	{
		int c=0;
		while(a>0)
		{
			c++;
			a=a/10;
		}
		return c;
	}
}
