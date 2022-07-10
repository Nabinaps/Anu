package polymorphism;

public class x 
{

		int a;
		static int b;
		static void display()
		{
			x a1=new x();
			a1.a=50;
			System.out.println(b);
			System.out.println(b);
		}
		void show()
		{
			System.out.println(a);
			System.out.println(b);
		}
		public static void main(String[] args)
		{
			x a=new x();
			a.a=10;
			a.b=50;
			x.display();
			a.show();
		}

}
