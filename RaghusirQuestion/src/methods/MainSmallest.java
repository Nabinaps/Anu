package methods;
import java.util.Scanner;
public class MainSmallest
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the numbers");
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	
	int res=small(a,b,c);
		System.out.println("the smallest is "+res);
	}
	static int small(int p,int q,int r)
	{
		
		if(p<q && p<r)
		return p;
		else if (q<r)
		return q;
		else
		return r;
	}
}
	
		