 package ExceptionHandling;

public class Main_customException 
{
	public static void main(String[] args) throws wrgpassException 
	{
		try
		{
		check(23);
		}
		catch(wrgpassException w)
		{
			System.out.println("exception handled");	
		}
	}
	public static void check(int i) throws wrgpassException
	{
		int pass=123;
		if(pass==i)
		{
			System.out.println("continues");
		}
		else
		{
			throw new wrgpassException("incorrect pwd");
		}
	}
}
class wrgpassException extends Exception
{
	wrgpassException(String s)
	{
		super(s);
	}
}
