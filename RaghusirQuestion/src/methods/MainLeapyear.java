package methods;
import java.util.Scanner;
public class MainLeapyear
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any year");
	int a =sc.nextInt();
	boolean yr=leapyr(a);
	if(yr==true)
		System.out.println("This is a leapyear");
	else
		System.out.println("this is not a leapyear");
	}
	static boolean leapyr(int x)
	{
		if ((x%4==0 && x%100!=0)||(x%400==0))
			return true;
		else
			return false;
	}

}