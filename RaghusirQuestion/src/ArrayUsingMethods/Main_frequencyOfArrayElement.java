package ArrayUsingMethods;

import java.util.Scanner;

public class Main_frequencyOfArrayElement 
{
	public static void main(String[] args) 
	{
	System.out.println("enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	boolean rs[]=new boolean[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(rs[i]==false)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				rs[j]=true;
				}
			}
			System.out.println(a[i]+"->"+c);
		}
	}
	}
}
