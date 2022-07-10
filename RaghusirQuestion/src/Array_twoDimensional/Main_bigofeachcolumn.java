package Array_twoDimensional;

public class Main_bigofeachcolumn 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] big=getBig(x);
		System.out.println("Biggest element of each column is: ");
		System.out.println();
		for(int i=0;i<big.length;i++)
		{
			System.out.println("biggest elemment of "+(i+1)+" column is "+big[i]);
		}
	}

	private static int[] getBig(int[][] x) 
	{
		int a[]=new int[x[0].length];
		for(int i=0;i<x[0].length;i++)
		{
			int b=x[0][i];
			
			for(int j=1;j<x.length;j++)
			{
				if(x[j][i]>b)
					b=x[j][i];
			}
			a[i]=b;
		}
		
		return a;
	}
}
