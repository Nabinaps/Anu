package Array_twoDimensional;

public class Main_sumOfElementOfMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int sum=getSum(x);
		System.out.println("Sum of the elements of the matrix is: "+sum);	
	}

	private static int getSum(int[][] x) 
	{
		int s=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				s=s+x[i][j];
			}
		}
		
		return s;
	}
}
