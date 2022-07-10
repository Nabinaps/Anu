//WAJP TO PRINT SUM OF EVEN AND ODD NUMBER WITH IN N
package looping;

import java.util.Scanner;

public class EvenOddSum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int Esum=0;
		int Osum=0;
		while(n>0)
		{
			if(n%2==0)
				Esum=Esum+n;
			else
				Osum=Osum+n;
			n--;
		}
		System.out.println("the sum of even number is "+Esum);
		System.out.println("the sum of odd number is "+Osum);
	}
}
