package nabin;

public class Main_constructorOverLoading 
{
	int age;
	String name;
	Main_constructorOverLoading(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	Main_constructorOverLoading(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Main_constructorOverLoading a1=new Main_constructorOverLoading(18,"anu");
		a1.display();
		Main_constructorOverLoading a2=new Main_constructorOverLoading("nabin",24);
		a2.display();
	}
}
