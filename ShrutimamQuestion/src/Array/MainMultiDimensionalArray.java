package Array;

public class MainMultiDimensionalArray {
	static int a[][]= {{34,56,50},{78,34,78},{34,56,78}};
	public static void main(String[] args) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
		
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
