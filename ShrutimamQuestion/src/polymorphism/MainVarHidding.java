package polymorphism;

public class MainVarHidding
{
	public static void main(String[] args)
	{
	
	son s1=new son();
	s1.name="nabin";
	System.out.println(s1.name);
	}
	
}
class father
{
	String name;
}
class son extends father
{
	String name;
}
