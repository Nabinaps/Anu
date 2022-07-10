package pattern1;
/*
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 
1 0 1 0 1 
 */

import java.util.Scanner;

public class MainPattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
}
