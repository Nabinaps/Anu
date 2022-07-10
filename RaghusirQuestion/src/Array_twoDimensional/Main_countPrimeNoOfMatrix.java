package Array_twoDimensional;

public class Main_countPrimeNoOfMatrix 
{
	public static void main(String[] args) 
	{
		Main_matrix mt=new Main_matrix();
		int[][] x=mt.readArray();
		System.out.println("user enter matrix is:");
		mt.displayArray(x);
		int prime=getPrime(x);
		System.out.println(" number of prime number present in the matrix is: "+prime);	
	}

	private static int getPrime(int[][] x) 
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				boolean p=isPrime(x[i][j]);
				if(p==true)
					count++;
			}
		}
		
		return count;
	}

	private static boolean isPrime(int y) 
	{
		for(int i=2;i<=y/2;i++)
			if(y%i==0)
			{
				return false;
			}
		return true;
	}
}
