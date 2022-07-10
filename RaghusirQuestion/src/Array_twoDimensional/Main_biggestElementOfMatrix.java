package Array_twoDimensional;

public class Main_biggestElementOfMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int big=getBig(x);
		System.out.println("Biggest element of the matrix is: "+big);	
	}

	private static int getBig(int[][] x) 
	{
		int b=x[0][0];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]>b)
					b=x[i][j];
			}
		}
		
		return b;
	}
}
