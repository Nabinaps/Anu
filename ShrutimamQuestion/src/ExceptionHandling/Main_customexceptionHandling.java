package ExceptionHandling;

import java.util.Scanner;

public class Main_customexceptionHandling 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		try 
		{
			if( age<18)
			{
				throw new InvalidException("you are under age");
			}
			else
			{
				System.out.println("ok you can vote");
			}
		}
		catch(InvalidException e)
		{
			System.out.println("exception handled");
			System.out.println(e);
		}
		
	}
}
class InvalidException extends Exception
{
	InvalidException(String s)
	{
		super(s);
	}
}
