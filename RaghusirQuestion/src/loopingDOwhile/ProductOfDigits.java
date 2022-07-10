package loopingDOwhile;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int product=getProduct(n);
		System.out.println("product of digits is "+product);
	}
		static int getProduct(int n)
		{
			int result=1;
			do {int d=1;
				d=n%10;
				result=result*d;
				n=n/10;
			}while(n!=0);
			return result;
		}

}
