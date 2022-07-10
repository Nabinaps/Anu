package assignment;

public class MainPerfectAll 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<=10000;i++)
		{
			boolean per=isPerfect(i);
			if(per==true)
				{
					System.out.println(i);
				}
		}
	}
	static boolean isPerfect(int x)
	{
		int sum=0,temp=x;
			for(int i=1;i<=x/2;i++)
			{
				if(x%i==0)
					{
						sum=sum+i;
					}
			}
		return sum==temp;
	}
}
