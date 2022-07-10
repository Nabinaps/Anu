package Array;

public class MainPrintEvenNoOfArray 
{
	static int a[]= {34,56,5,78,34};
	public static void main(String[] args) 
	{
		System.out.println("by using Normal for loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("even numbers are ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers are ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("==============================================================================");
	// Advanced for loop OR for each loop OR enhanced for loop
		System.out.println("by using advanced for loop");
		for(int k:a)   
		{
			System.out.println(k);
		}
		System.out.println("even numbers are ");
		for(int n:a)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
	}
}
