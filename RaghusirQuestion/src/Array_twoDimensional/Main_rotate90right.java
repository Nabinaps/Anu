package Array_twoDimensional;

public class Main_rotate90right 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int[][] y=Main_transposeMatrix.getTranspose(x);
		int res[][]=Main_rowWiseReverse.getReverse(y);
		System.out.println("after rotation");
		mt.displayArray(res);
		
	}
}
