package pattern;
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.Scanner;

public class MainPattern8
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}