package INHERITANCE;

public class MainMultiple implements I1,I2
{
	
	public static void main(String[] args) 
	{
		MainMultiple a1=new MainMultiple();
		a1.show();
		a1.display();
	}
	public void show() 
	{
		System.out.println("hi baby");
		
	}
	public void display() 
	{
		System.out.println("yes babu");
		
	}
}
interface I1
{
	void display();
}
interface I2
{
	void show();
}
