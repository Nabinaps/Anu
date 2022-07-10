package assignment;

import java.util.Scanner;

public class MainStrongNo 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		boolean rs=isStrongNo(i);
		if(rs==true)
		{
			System.out.println(i);
		}
	}
}

private static boolean isStrongNo(int x) {
	
		int sum=0,temp=x;
		do {
			int r=x%10;
			sum=sum+fact(r);
			x=x/10;
		}while(x!=0);
	return sum==temp;
}

private static int fact(int y) 
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
