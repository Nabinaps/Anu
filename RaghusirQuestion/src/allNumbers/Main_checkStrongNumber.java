package allNumbers;

import java.util.Scanner;

//Strong number is a number whose sum of all digits' factorial is equal to the number
//145=1!+4!+5!
public class Main_checkStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+fact(digit);
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a strong number");
		else
			System.out.println(temp+" is not a strong number");
	}

	private static int fact(int x) 
	{
		int f=1;
		while(x>0)
		{
			f=f*x;
			x--;
		}
		return f;
	}
}
