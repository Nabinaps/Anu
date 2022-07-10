package nabin;

public class Main_encapsulation 
{
	private int age;
	private String name;
	Main_encapsulation(int a,String b)
	{
		age=a;
		name=b;
	}
	public String get()
	{
		return age+name;
	}
	
	public static void main(String[] args) {
		Main_encapsulation a1=new Main_encapsulation(18,"ANU");
		System.out.println(a1.get());
	
	}
}
