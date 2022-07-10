//WAJP TO FIND FACTORIAL OF A NUMBER
package looping;

import java.util.Scanner;

public class Factorial1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
			int res=1;
			while(n>1)
			{
				res=res*n;
				n--;
				
			}
			System.out.println("factorial of the number is "+res);
	}
}
