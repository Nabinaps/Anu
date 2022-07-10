package PrintMyName;

import java.util.Scanner;

public class PrintN {
	public static void main(String[] args) 
	{
		N();
	}
	static void N()
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number");
		//int n=sc.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || j==1 || j==5)
				System.out.print("*"+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
