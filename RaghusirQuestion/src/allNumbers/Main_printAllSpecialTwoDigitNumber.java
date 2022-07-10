package allNumbers;

import java.util.Scanner;

public class Main_printAllSpecialTwoDigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last range");
		int n=sc.nextInt();
		System.out.println("all special two digit number is");
		for(int i=10;i<=n;i++ )
		{
			boolean s=isSpecial(i);
			if(s)
				System.out.println(i);
		}
}

	private static boolean isSpecial(int x) 
	{
		int d1=x%10;
		int d2=x/10;
		int sum=d1+d2+d1*d2;
		
		if(sum==x)
		{
			return true;
		}
	
		return false;
	}
}
