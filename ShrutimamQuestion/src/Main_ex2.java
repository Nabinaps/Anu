import java.util.TreeMap;

public class Main_ex2 
{
	public static void main(String[] args) 
	{
		TreeMap<Object,Object>t1=new TreeMap<Object,Object>();
		
		t1.put("p1", new Person(24,"nabin"));
		t1.put("p2", new Person(18,"anu"));
		System.out.println(t1);
	}
}
class Person
{
	int x;
	String name;
	Person(int x,String name )
	{
		this.x=x;
		this.name=name;
	}
	public String toString()
	{
		return x+" "+name;
	}
}
