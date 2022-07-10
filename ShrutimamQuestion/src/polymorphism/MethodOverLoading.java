package polymorphism;

public class MethodOverLoading 
{
	int a;
	String b;
	void display(int a)
	{
		System.out.println(a);
	}
	void display(String x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	void display( String p)
	{
		System.out.println(p);
	}
	void display(int q,String r)
	{
		System.out.println(q);
		System.out.println(r);
	}
	public static void main(String[] args) {
		MethodOverLoading a1=new MethodOverLoading ();
		a1.display(123);
		a1.display(123,"nabin");
		a1.display("anu");
		a1.display("anjali",143);
	}

}
