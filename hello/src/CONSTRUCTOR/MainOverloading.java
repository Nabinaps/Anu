package CONSTRUCTOR;

public class MainOverloading 
{
	int age;
	String name;
	MainOverloading(int a)
	{
		age=a;
	}
	MainOverloading(String n)
	{
		name=n;
	}
	MainOverloading(int x,String y)
	{
		age=x;
		name=y;
	}
	void details()
	{
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		MainOverloading a1=new MainOverloading(22);
		a1.details();
		MainOverloading a2=new MainOverloading("NABIN");
		a2.details();
		MainOverloading a3=new MainOverloading(18,"ANU");
		a3.details();
	}
}
