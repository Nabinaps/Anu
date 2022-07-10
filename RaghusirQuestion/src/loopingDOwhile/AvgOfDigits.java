package loopingDOwhile;

import java.util.Scanner;

public class AvgOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		float DC=getDigitAvg(n);
		System.out.println(DC);
	}
		static float getDigitAvg(int n)
		{
			float sum=0;
			int c=0;
			do {
				int d=0;
				d=n%10;
				sum=sum+d;
				n=n/10;
				c++;
			}while(n!=0);
			return sum/c;
		}
}
