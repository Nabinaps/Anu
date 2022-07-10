package methods;
import java.util.Scanner;
public class MainPassFail
{

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the numbers");
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int d =sc.nextInt();
	String yr=pass(a,b,c,d);
	System.out.println(yr);
	
	}
	static String pass(int w,int x,int y,int z)
	{
		if (w>=35 && x>=35 && y>=35 && z>=35)
			return "pass";
		else
			return "fail";
	}

}
