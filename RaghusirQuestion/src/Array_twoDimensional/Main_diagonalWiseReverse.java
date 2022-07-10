package Array_twoDimensional;

public class Main_diagonalWiseReverse
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[][] reverse=getReverse(x);
		System.out.println("diagonal wise reverse  matrix is :");
		mt.displayArray(reverse);
	}

	public static int[][] getReverse(int[][] x) 
	{
		int i=0,j=x.length-1;
		while(i<j)
		{
			int temp=x[i][i];
			x[i][i]=x[j][j];
			x[j][j]=temp;
			int t=x[i][j];
			x[i][j]=x[j][i];
			x[j][i]=t;
			i++;
			j--;
		}
		
		return x;
	}
}
