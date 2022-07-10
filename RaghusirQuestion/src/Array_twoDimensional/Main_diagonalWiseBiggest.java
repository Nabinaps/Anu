package Array_twoDimensional;

public class Main_diagonalWiseBiggest 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] big=getBig(x);
		System.out.println("Biggest element of diagonal is: ");
		System.out.println();
		for(int i=0;i<big.length;i++)
		{
			System.out.println("biggest elemment of diagonal "+(i+1)+" is "+big[i]);
		}
	}

	private static int[] getBig(int[][] x) 
	{
		int b=x[0][0];
		int a=x[0][x[0].length-1];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				if(x[i][j]>b&&i==j)
					b=x[i][j];
				if(i+j==x.length-1 && x[i][j]>a)
					a=x[i][j];
			}
			}
		int[] big= {b,a};
		return big;
	}
}
