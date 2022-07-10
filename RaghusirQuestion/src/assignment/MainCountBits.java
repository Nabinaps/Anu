package assignment;

import java.util.Scanner;

public class MainCountBits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int c=getcount(n);
		System.out.println(c);
	}
		static int getcount(int x)
		{
			int count=0;
			do {
				int d=x;
				int r=d%2;
				if(r==1)
				{
				 count++;
				}
				x=x/2;
			}while(x!=0);
			return count;
		}
		
}
