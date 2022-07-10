package Array_twoDimensional;

public class Main_rowWiseSum {
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] big=getSum(x);
		System.out.println("Biggest element of each row is: ");
		System.out.println();
		for(int i=0;i<big.length;i++)
		{
			System.out.println("biggest elemment of "+(i+1)+" row is "+big[i]);
		}
	}

	private static int[] getSum(int[][] x) 
	{
		int a[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<x[0].length;j++)
			{
					sum=sum+x[i][j];
			}
			a[i]=sum;
		}
		
		return a;
	}
}
