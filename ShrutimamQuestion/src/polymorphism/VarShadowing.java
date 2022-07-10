package polymorphism;

public class VarShadowing 
{
	int a;
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		VarShadowing v1=new VarShadowing();
		v1.a=100;
		System.out.println(v1.a);
	}
}

//another way 
