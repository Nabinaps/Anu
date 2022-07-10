package PrintMyName;

import java.util.Scanner;

public class PrintA 
{
	public static void main(String[] args) {
		A();
	}
	static void A() {
		//System.out.println("enter the number");
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();

		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5||i==1||i==5/2+1)
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}
