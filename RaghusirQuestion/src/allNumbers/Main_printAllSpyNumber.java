package allNumbers;

import java.util.Scanner;

public class Main_printAllSpyNumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("all spy number within "+n);

		for(int i=0;i<=n;i++)
		{
			int temp=i;
			int sumdigit=0;
			int productdigit=1;
			while(temp>0)
			{
				int digit=temp%10;
				sumdigit=sumdigit+digit;
				productdigit=productdigit*digit;
				temp=temp/10;
			}
			if(sumdigit==productdigit)
				System.out.println(i);
		}
	}
}
