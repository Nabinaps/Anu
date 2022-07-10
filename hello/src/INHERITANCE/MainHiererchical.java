package INHERITANCE;

public class MainHiererchical 
{
	public static void main(String[] args) 
	{
		Apple a1=new Apple();
		a1.print();
		Mango m1=new Mango();
		m1.print();
	}
}
class Fruit
{
	void print()
	{
		System.out.println("anjali");
	}
}
class Apple extends Fruit
{
	
}
class Mango extends Fruit
{
	
}
