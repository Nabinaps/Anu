package allNumbers;

import java.util.Scanner;

//A disarium number is a number in which the sum of the digits to the power
//of their respective position is equal to the number itself
//135=1^1+3^2+5^3
public class Main_checkDisariumNumber 
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
			digit--;
			k=k/10;
		}
		if(sum==n)
			System.out.println(n+" is a disarium number");
		else
			System.out.println(n+" is not a disarium number");
		
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
