//WAJP TO CALCULATE SUM OF N NATURAL NUMBER
package looping;

import java.util.Scanner;

public class SumOfNaturalNo1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
			int s=0;
			while(n>0)
			{
				s=s+n;
				n--;
			}
			System.out.println(s);
	}
}
