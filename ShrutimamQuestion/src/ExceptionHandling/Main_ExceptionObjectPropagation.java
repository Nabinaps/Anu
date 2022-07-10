package ExceptionHandling;

public class Main_ExceptionObjectPropagation {
	public static void main(String[] args) {
		System.out.println("started");
		show();
		System.out.println("main continues");
	}
	static void show()
	{
		print();
		System.out.println("print methods continues");
	}
	static void print() 
	{
		try
		{
		System.out.println(100/0);
		}
		
		catch(ArithmeticException ae)
		{
			d();
			System.out.println(ae);
			ae.printStackTrace();
			System.out.println("handled");
		}
		System.out.println("after exception");
	}
	static void d()
	{
		System.out.println("hello baby");
	}
}
