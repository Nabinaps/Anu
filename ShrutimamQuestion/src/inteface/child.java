package inteface;

public class child implements I1,I2
{
	int c;
	public void sample()
	{
		System.out.println("provide body to I1");
	}
	public void display()
	{
		System.out.println("provide body to I2");
	}
	public static void main(String[] args) 
	{
		child c1=new child();
		c1.c=120;
		c1.sample();
		c1.display();
		System.out.println(c1.c);
		System.out.println(c1.a);
		System.out.println(c1.b);
		I1.printI1();//calling static method by interface name 
		I2.printI2();
	}
	
}
interface I1
{
	int a=20;
	void sample();
	static void printI1()
	{
		System.out.println("concreate static method of I1");
	}
}
interface I2
{
	int b=234;
	void display();
	static void printI2()
	{
		System.out.println("concreate static method of I2 ");
	}
}
