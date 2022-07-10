package Array_twoDimensional;

public class Main_countEvenOddMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[] count=getCount(x);
		System.out.println("number of even element in the matrix is: "+count[0]);	
		System.out.println("number of odd elements in the matrix is: "+count[1]);
	}

	private static int[] getCount(int[][] x) 
	{
		int even=0;
		int odd=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]%2==0)
					even++;
				else
					odd++;
			}
		}
		int []c= {even,odd};
		
		return c;
	}
}
