package pattern1;
/*
 A
 B A
 C B A
 D C B A
 E D C B A
 */
import java.util.Scanner;

public class MainPattern2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
}
