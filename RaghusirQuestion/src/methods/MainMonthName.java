package methods;
import java.util.Scanner;
public class MainMonthName
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any number");
	int a =sc.nextInt();
	String m=month(a);
	
	System.out.println(m);
	}
	static String month(int a)
	{
		if(a==1)
		return "JANUARY";
		else if(a==2)
		return "FEBRUARY";
		else if(a==3)
		return "MARCH";
		else if(a==4)
		return "APRIL";
		else if(a==5)
		return"MAY";
		else if(a==6)
		return"JUNE";
		else if(a==7)
		return"JULY";
		else if(a==8)
		return "AUGUST";
		else if(a==9)
		return "SEPTEMBER";
		else if(a==10)
		return "OCTOBER";
		else if(a==11)
		return "NOVEMBER";
		else if(a==12)
		return "DECEMBER";
		else
		return "invalid";
	}
}