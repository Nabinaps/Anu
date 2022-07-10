package Array_twoDimensional;

public class Main_bigOfEachRow 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] big=getBig(x);
		System.out.println("Biggest element of each row is: ");
		System.out.println();
		for(int i=0;i<big.length;i++)
		{
			System.out.println("biggest elemment of "+(i+1)+" row is "+big[i]);
		}
	}

	private static int[] getBig(int[][] x) 
	{
		int a[]=new int[x.length];
		for(int i=0;i<x.length;i++)
		{
			int b=x[i][0];
			
			for(int j=0;j<x[0].length;j++)
			{
				if(x[i][j]>b)
					b=x[i][j];
			}
			a[i]=b;
		}
		
		return a;
	}
}
