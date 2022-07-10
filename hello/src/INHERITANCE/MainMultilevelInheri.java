package INHERITANCE;

public class MainMultilevelInheri 
{
	public static void main(String[] args) 
	{
		Son s1=new Son();
		s1.display();
		s1.print();
		Father f1=new Father();
		f1.display();
	}
}
class Grandfather
{
	void display()
	{
		System.out.println("hey");
	}
}
class Father extends Grandfather
{
	void print()
	{
		System.out.println("hello");
	}
}
class Son extends Father
{
	
}
