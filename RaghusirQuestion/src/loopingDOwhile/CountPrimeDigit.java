package loopingDOwhile;

import java.util.Scanner;

public class CountPrimeDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int DC=getPrimeDigit(n);
		System.out.println(DC);
	}
		static int getPrimeDigit(int n)
		{
			int c=0;
			do {
				int d=0;
				d=n%10;
				if(d==1||d==2||d==3||d==5||d==7)
					c++;
				n=n/10;
			}while(n!=0);
			return c;
		}
}
