package allNumbers;
//A number is thought of as an Armstrong number if the sum of its own digits raised to the power 
//number of digits gives the number itself

import java.util.Scanner;

public class Main_checkArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int digit=countDigit(n);
		//System.out.println(digit);
		int sum=0;
		int k=n;
		while(k>0)
		{
			int d=k%10;
			sum=sum+pow(digit,d);
			k=k/10;
		}
		if(sum==n)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not an armstrong number");
		
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
