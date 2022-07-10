package inheri;

abstract class Exswitch
{
	String brand;
	float price;
	abstract public void Switchoff();
	abstract public void Switchon();
	Exswitch(float x,String y)
	{
		price=x;
		brand=y;
	}
	
	public void display()
	{
		System.out.println(brand);
		System.out.println(price);
	}

}
 class Bulb extends Exswitch
{
	 String bbrand;
	 Bulb(float p,String b,String c)
	 {
		 super(p,c);
		 bbrand=b;
	 }
	public void Switchoff()
	{
		System.out.println(bbrand);
		System.out.println("BULB GIVES LIGHT");
	}
	public void Switchon()
	{
		System.out.println("IT IS VERY USEFULL");
	}
}
 class IronBox  extends Exswitch
{
	
	IronBox(float x,String y) {
		super(x, y);
	}
	public void Switchoff()
	{
		System.out.println("1234567890");
	}
	public void Switchon()
	{
		System.out.println("gdhhdiueiweheueuuf");
	}
}
public class A
{
	public static void main(String [] args)
	{
		Bulb b=new Bulb(786f,"havels","philips");
		b.display();
		b.Switchoff();
		b.Switchon();
		IronBox i=new IronBox(456f,"abdsj");
		i.display();
		i.Switchoff();
		i.Switchon();
				
	}
} 
/*class Refregerator extends Exswitch
{
	public void Switchoff()
	{
		System.out.println("bulb produces light");
	}
	public void Switchon()
	{
		System.out.println("bulb is turned off");
	} 
}*/