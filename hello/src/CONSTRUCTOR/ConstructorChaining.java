package CONSTRUCTOR;


public class ConstructorChaining 
{
	public static void main(String[] args) 
	{
		Father f1=new Father(143,"Anu");
		f1.print();
	}
}
class Grandfather
{
	int age;
	Grandfather(int a)
	{
		age=a;
	}
	void show()
	{
		System.out.println("love you");
	}

}
class Father extends Grandfather
{
	String name;
	Father(int a,String n) 
	{
		super(a);
		name=n;
	}

	void print()
	{
		super.show();
		System.out.println(name+" my dream girl "+age);
		super.show();
		
	}
}