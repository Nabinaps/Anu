package loopingDOwhile;

import java.util.Scanner;
//without method
/*public class CountDigits {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			int DC=0;
			
			do {
				n=n/10;
				DC++;
			}while(n!=0);
			System.out.println(DC);
		}
}*/
//with method
public class CountDigits {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			int DC=getDigit(n);
			System.out.println(DC);
		}
			static int getDigit(int n)
			{
				int a=0;
			do {
				n=n/10;
				a++;
			}while(n!=0);
			return a;
			
		}
}

