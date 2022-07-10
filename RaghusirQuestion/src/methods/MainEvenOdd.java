package methods;

import java.util.Scanner;
public class MainEvenOdd
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int a =sc.nextInt();
	boolean x =even(a);
	if(x)
		System.out.println(a+" is a even number");
	else
		System.out.println(a+" is a odd number");
	}
	static boolean even(int p)
	{
		if(p%2==0)
		return true;
		else 
		return false;
	}
}