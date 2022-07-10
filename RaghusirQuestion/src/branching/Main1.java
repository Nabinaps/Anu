package branching;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) 
	{
		int bs,gs,da,hra;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary");
		bs=sc.nextInt();
		if(bs>1500)
		{
			hra=bs*10/100;
			da=bs*90/100;
		}
		else
		{
			hra=500;
			da=bs*98/100;
		}
		gs=bs+hra+da;
		System.out.println("gross salary is "+gs);
	}
}