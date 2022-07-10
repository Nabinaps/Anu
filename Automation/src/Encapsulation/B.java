package Encapsulation;

public class B 
{
	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println(a1.getValue());
		a1.setValue(20);
		int x = a1.getValue();
		System.out.println(x);
	}
}
