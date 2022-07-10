package stringClass;

import java.util.Scanner;

public class Main_SumOfDigitOfString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int res=getSum(st);
		System.out.println("addition of the digits are");
		System.out.println(res);
	}

	public static int getSum(String str) 
	{
		int sum=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]>='1'&&ch[i]<='9')
				{
					int x=ch[i]-48;
					sum=sum+x;
					//System.out.println(x);
				}
			
		}
		return sum;
	}
}
