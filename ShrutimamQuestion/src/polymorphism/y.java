package polymorphism;

public class y 
{
	static int b=10;
	 void display()
	{
		 int b=30;
		System.out.println(b);
		System.out.println(y.b);
		System.out.println(this.b);//if want to display global static variable inside block which same name as local
	}
	 public static void main(String[] args) {
		z a1=new z();
		a1.display();
		a1.show();
	}
}
class z extends y
{
	static int b=20; 
	void show()
	{
		int b=50;
		System.out.println(b);
		System.out.println(z.b);
		System.out.println(this.b);
		System.out.println(y.b);
		System.out.println(super.b);//if want to display global static variable of parent inside block 
									//	of child class which same name as local use super
	}
	
	
}
