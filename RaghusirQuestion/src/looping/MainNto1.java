package looping;

import java.util.Scanner;

public class MainNto1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		while(n>0)
		{
			System.out.println(n);
			n--;
		}
	}

}
