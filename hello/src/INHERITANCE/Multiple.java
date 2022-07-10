package INHERITANCE;

public class Multiple extends In implements I3
{
	
	public static void main(String[] args) 
	{
		Multiple a1=new Multiple();
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
class In
{
	void display()
	{
		System.out.println("hi baby");;
	}
}
interface I3
{
	void show();
}
