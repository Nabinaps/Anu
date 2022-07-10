package ArrayUsingMethods;

import java.util.Scanner;

public class MainBiggestNumber 
{
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the size of the array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter the values of array");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int b=count(a);
			System.out.println("prime number present is "+b);
		}

		private static int count(int[] a) {
			int c=0;
			for(int i=0;i<a.length;i++)
			{
				boolean b=isPrime(a[i]);
				if(b==true)
				{
					c++;
				}
			}
			return c;
		}

		private static boolean isPrime(int x) {
			for(int i=2;i<=x/2;i++)
			{
				if(x%i==0)
					return false;
			}
			return true;
		}
		
	}

