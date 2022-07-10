package allNumbers;

import java.util.Scanner;

public class Main_printAllArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("armstrong number within "+n+" is");
		for(int i=0;i<=n;i++)
		{
			int digit=countDigit(i);
			int k=i;
			int sum=0;
			while(k>0)
			{
				int d=k%10;
				sum=sum+pow(digit,d);
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
//another way by using method for armstrong
class Arm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean arms=isArmstrong(n);
		if(arms==true)
			System.out.println("Yes, "+n+" is an armstrong number");
		else
			System.out.println("No, "+n+" is not an armstrong number");
		System.out.println();
		System.out.println();
		System.out.println("armsrtong number within "+n+" is:");
		for(int i=0;i<=n;i++)
		{
			boolean ar=isArmstrong(i);
			if(ar)
				System.out.println(i);
		}
	}
	public static boolean isArmstrong(int x)
	{
		int digit=countDigit(x);
		int sum=0;
		int temp=x;
		while(x>0)
		{
			int d=x%10;
			sum=sum+power(d,digit);
			x=x/10;
		}
		return temp==sum;
	}
	private static int power(int x, int y) {
		int p=1;
		while(y>0)
		{
			p=p*x;
			y--;
		}
		return p;
	}
	private static int countDigit(int x) {
		int c=0;
		while(x>0)
		{
			c++;
			x=x/10;
		}
		return c;
	}
}

