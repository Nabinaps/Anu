package Array_twoDimensional;

public class Main_transposeMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[][] transpose=getTranspose(x);
		System.out.println("transpose matrix is :");
		mt.displayArray(transpose);
	}

	public static int[][] getTranspose(int[][] x) 
	{
		
		int transpose[][]=new int[x[0].length][x.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				transpose[j][i]=x[i][j];
			}
		}
		return transpose;
	}
}

