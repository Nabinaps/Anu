package pattern1;
/*
1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 
 */

import java.util.Scanner;

public class MainPattern11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			//System.out.print(i+" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
}