package loopingDOwhile;

import java.util.Scanner;

public class ArmstrongNo 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the last range");
			int n=sc.nextInt();
			for(int i=0;i<=n;i++)
			{
				boolean arms=isArmstrong(i);
				if(arms==true)
					System.out.println(i+" is an armstrong number");
			}
	}

		private static boolean isArmstrong(int x) 
		{
			int sum=0,temp=x;
			
			do {
					int d=x%10;
					sum=sum+d*d*d;
					x=x/10;
			}while(x!=0);
			if(sum==temp)
				return true;
			return false;
		}

}
