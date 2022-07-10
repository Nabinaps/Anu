package PrintMyName;

import java.util.Scanner;

public class PrintI {
	public static void main(String[] args) {
		I();
	}
	static void I() {

		//System.out.println("enter the number");
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();

		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==5/2+1||i==1||i==5)
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
