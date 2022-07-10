package allNumbers;

import java.util.Scanner;

// A spy number is a number where the sum of its digits equals the product of its digits.
//123,1124 etc
public class Main_checkSpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sumdigit=0;
		int productdigit=1;
		while(n>0)
		{
			int digit=n%10;
			sumdigit=sumdigit+digit;
			productdigit=productdigit*digit;
			n=n/10;
		}
		if(sumdigit==productdigit)
			System.out.println(temp+" is a SPY number");
		else
			System.out.println(temp+" is not a SPY number");
	}
}
