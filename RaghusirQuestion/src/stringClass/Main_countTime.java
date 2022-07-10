package stringClass;

import java.util.Scanner;

public class Main_countTime 
{
	static int diff;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st time in 24 hr format:  hr:min");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		System.out.println("enter 2nd time in 24 hour format:  hr:min");
		int hr1=sc.nextInt();
		int min1=sc.nextInt();
		int x=time(hr1,min1);
		int y=time(hr,min);
		if(x>y)
			diff=x-y;
		else
			diff=y-x;
		int h=diff/60;
		int m=diff%60;
		System.out.println("the difference is: ");
		System.out.println(h+" hours "+m+" minutes ");
	}

	private static int time(int x, int y) {
		return x*60+y;
	}
}
