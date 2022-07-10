package polymorphism;

public class NabinMShadow 
{

	public static void main(String[] args) 
	{
		anjali a1=new anjali();
		a1.di();
		Anu a2=new Anu();
		a2.di();
	}

}
class Anu
{
	static void di()
	{
		System.out.println("hi");
	}
}
class anjali extends Anu
{
	static void di()
	{
		System.out.println("hello");
	}
}