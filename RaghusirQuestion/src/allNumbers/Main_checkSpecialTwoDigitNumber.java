package allNumbers;

import java.util.Scanner;

//when the sum of its digits is added to the product of its digits, 
//the result is equal to the original two-digit number
//number=d1+d2+d1*d2
public class Main_checkSpecialTwoDigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
			int d1=n%10;
			int d2=n/10;
			int sum=d1+d2+d1*d2;
			
			if(sum==n)
				System.out.println(n+" is a special two digit number");
			else
				System.out.println(n+" is not a special two digit number");
	}
}
