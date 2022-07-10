package Array_twoDimensional;

public class Main_spiralOrderAnticlockwise {
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		printSpiral(x);
	}

	private static void printSpiral(int[][] x) {
		int n=x.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.println(x[k][i]);
			for(int k=i;k<j;k++)
				System.out.println(x[j][k]);
			for(int k=j;k>i;k--)
				System.out.println(x[k][j]);
			for(int k=j;k>i;k--)
				System.out.println(x[i][k]);
		}
		if(n%2==1)
		{
			System.out.println(x[n/2][n/2]);
		}
	}

}
