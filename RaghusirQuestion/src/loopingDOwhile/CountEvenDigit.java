package loopingDOwhile;

import java.util.Scanner;

public class CountEvenDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int DC=getEvenDigit(n);
		System.out.println(DC);
	}
		static int getEvenDigit(int n)
		{
			int s=0;
			do {
				int d=0;
				d=n%10;
				n=n/10;
				if(d%2==0)
					s++;
			}while(n!=0);
			return s;
		}
}


