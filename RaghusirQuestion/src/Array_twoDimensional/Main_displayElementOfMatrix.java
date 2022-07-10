package Array_twoDimensional;

import java.util.Scanner;

public class Main_displayElementOfMatrix 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the matrix");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] a=new int [row][col];
		System.out.println("enter "+row*col+" elements");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("user enter matrix is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[0][1]);
	}
}
