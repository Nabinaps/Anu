package ExceptionHandling;

public class Main_ex1 {
	public static void main(String[] args) {
		System.out.println("started");
		int a[]= {12,34};
		int n=100;
		try
		{
			System.out.println(a[654]);
			System.out.println("this line will execute only if no exception in privious line");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exeption caught");
			System.out.println(e);
			e.printStackTrace();
		}
		
		try
		{
			System.out.println(n/0);
			System.out.println("this line will execute only if no exception in privious line");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception caught");
			System.out.println(ae);
			ae.printStackTrace();
			
		}
		
		finally
		{
			System.out.println("finally block will execute always");
		}
		System.out.println("last line ");
	}
}
