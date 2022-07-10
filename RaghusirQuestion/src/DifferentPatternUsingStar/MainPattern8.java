package DifferentPatternUsingStar;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;

public class MainPattern8 
{
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n/2;i++)
		{
			for(int j=1;j<=n/2-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n/2;i>0;i--)
		{
			for(int j=1;j<=n/2-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
