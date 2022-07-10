package polymorphism;

public class ConsOver 
{
	int age;
	String name;
	ConsOver(int a,String b)
	{
		age=a;
		name=b;
	}
	ConsOver(String x,int y)
	{
		name=x;
		age=y;
	}
	void display()
	{
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		ConsOver c1=new ConsOver(23,"nabin");
		ConsOver c2=new ConsOver("NABIN",22);
		c1.display();
		c2.display();
		
	}
}
