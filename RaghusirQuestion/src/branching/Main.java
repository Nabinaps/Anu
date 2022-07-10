package branching;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		int b,cy,yoj,yos;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the current year");
		cy=sc.nextInt();
		System.out.println("enter the year of joining");
		yoj=sc.nextInt();
		yos=cy-yoj;
		if (yos>3)
		{
			b=2500;
			System.out.println("bonus is "+b);
			
		}
	}
}