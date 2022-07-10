package loopingDOwhile;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int DC=getSUMDigit(n);
		System.out.println(DC);
	}
		static int getSUMDigit(int n)
		{
			int sum=0;
			do {
				int d=0;
				d=n%10;
				sum=sum+d;
				n=n/10;
			}while(n!=0);
			return sum;
		}
}
