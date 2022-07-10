package assignment;

import java.util.Scanner;

public class MainStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		{
			for(int i=1;i<=n;i++)
			{
			boolean per=isStrong(i);
			if(per==true)
				{
					sum=sum+i;
					System.out.println(i);
				}
			}
		}
		System.out.println(sum);
	}
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
			do{
				int r=x%10;
				sum=sum+fact(r);
				x=x/10;
				
			}while(x!=0);

		return sum==temp;
	}
	static int fact(int y)
	{
		int f=1;
		while(y>0)
		{
			f=f*y;
			y--;	
		}
		return f;
	}
}
