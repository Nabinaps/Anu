package pattern;
/*make a pattern like below
 A B C D E
 A B C D E
 A B C D E
 A B C D E
 A B C D E
 */
import java.util.Scanner;

public class MainPattern2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		MainPattern2.Capital(n); 
		System.out.println("==========================================");
		MainPattern2.Small(n);
		
	}
		static void Capital(int n)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print((char)(j+64)+" ");
				}
				System.out.println();
			}
		}
		static void Small(int n)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print((char)(j+96)+" ");
				}
				System.out.println();
			}
		}
}
