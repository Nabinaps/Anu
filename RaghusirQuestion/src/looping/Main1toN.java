package looping;

import java.util.Scanner;

public class Main1toN 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
