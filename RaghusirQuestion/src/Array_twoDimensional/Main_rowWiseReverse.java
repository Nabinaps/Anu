package Array_twoDimensional;

public class Main_rowWiseReverse 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[][] reverse=getReverse(x);
		System.out.println("row wise reverse matrix is :");
		mt.displayArray(reverse);
	}

	public static int[][] getReverse(int[][] x) 
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length/2;j++)
			{
				int temp=x[i][j];
				x[i][j]=x[i][x[i].length-1-j];
				x[i][x[i].length-1-j]=temp;
			}
		}
		return x;
	}
}
