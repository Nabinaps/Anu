package Array_twoDimensional;

public class Main_addTwoMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter 1st matrix is:");
		mt.displayArray(x);
		int[][]y=mt.readArray();
		System.out.println("user enter 2nd matrix is:");
		mt.displayArray(y);
		int[][] addition=getAdd(x,y);
		if(addition!=null)
		{
		System.out.println("after addition:");
		mt.displayArray(addition);
		}
	}

	private static int[][] getAdd(int[][] a,int[][] b) 
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
		{
			System.out.println("not possible");
			return null;
		}
		int[][] add=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		
		return add;
	}
}
