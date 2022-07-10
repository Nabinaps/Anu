package Array_twoDimensional;

public class Main_columnWiseSum 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] big=getSum(x);
		System.out.println("Biggest element of each column is: ");
		System.out.println();
		for(int i=0;i<big.length;i++)
		{
			System.out.println("biggest elemment of "+(i+1)+" column is "+big[i]);
		}
	}

	private static int[] getSum(int[][] x) 
	{
		int a[]=new int[x[0].length];
		for(int i=0;i<x[0].length;i++)
		{
			int sum=0;
			
			for(int j=0;j<x.length;j++)
			{
					sum=sum+x[j][i];
			}
			a[i]=sum;
		}
		
		return a;
	}
}
