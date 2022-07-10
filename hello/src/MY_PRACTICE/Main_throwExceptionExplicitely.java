package MY_PRACTICE;

import java.util.Scanner;

public class Main_throwExceptionExplicitely 
{
	static void check(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible for vote");
		}
		else
			System.out.println("welcome for voting");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int n=sc.nextInt();
		check(n);
	}
}
