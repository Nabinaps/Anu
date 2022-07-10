package Array_twoDimensional;

import java.util.Scanner;

public class Main_matrix 
{
	public int[][] readArray()
	{
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
		return a;
	}
	public void displayArray(int[][] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
