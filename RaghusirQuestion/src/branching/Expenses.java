package branching;

import java.util.Scanner;

public class Expenses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the quantity");
		int q=sc.nextInt();
		System.out.println("enter the rate");
		float r=sc.nextFloat();
		int dis=0;
		if(q>1000)
			dis=10;
		float t=q*r-q*r*dis/100;
		System.out.println("total is "+t);
		
	}
}
