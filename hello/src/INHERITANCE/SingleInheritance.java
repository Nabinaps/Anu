package INHERITANCE;

public class SingleInheritance 
{
	static void show()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		A.show();
		SingleInheritance.show();
	}
}
class A extends SingleInheritance 
{
	static void show()
	{
		System.out.println("nabin");
	}
}
