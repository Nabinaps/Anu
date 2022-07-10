package inteface;

public class MainMultiple 
{
	public static void main(String[] args) 
	{
		SmartPhone p1=new SmartPhone();
		p1.profileDisplay();
		p1.price=18000;
		p1.brand="REALME";
		p1.RAM="8GB";
		p1.mobileDetails();
		
	}
}
class MobilePhone
{
	int price;
	String brand;
	String RAM;
	void mobileDetails()
	{
		System.out.println("price of the mobile is "+price);
		System.out.println("Brand of the mobile is "+brand);
		System.out.println("RAM of the mobile is "+RAM);
	}
	
}
interface SocialMedia
{
	String name="BBCNEWS";
	void profileDisplay();
	
}
class SmartPhone extends MobilePhone implements SocialMedia
{
	public void profileDisplay()
	{
		System.out.println("hello, i am from "+name);
		System.out.println("latest news is ");
		System.out.println("New mobile phone is released");
		System.out.println("details of the mobile is as below");
	}
}
