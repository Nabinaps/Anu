package StringClass;

public class MainToString 
{
	int age;
	String name;
	public static void main(String[] args) {
		MainToString a=new MainToString();
		a.age=20;
		a.name="ANU";
		System.out.println(a);
	}
	@Override
	public String toString() {
		return "MainToString [age=" + age + ", name=" + name + "]";
	}
	
}
