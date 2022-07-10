package polymorphism;
 class B
{
	 int a;
	 int b;
	 public void add()
	{
		System.out.println(a-b);
	}
}
class RunTimePoly extends B
{
	public void add()
	{
		super.add();
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		RunTimePoly a1=new RunTimePoly();
		a1.a=50;
		a1.b=30;
		a1.add();
	}
}