//WAJP TO PRINT ALL THE MULTIPLE OF A NUMBER WITH IN N
package looping;

import java.util.Scanner;

public class MulipleofAnumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int i=5;
		while(i<=n)
		{
			System.out.println(i);
			i=i+5;
		}
	}
}
