package String;
import java.util.Scanner;
public class Assignment 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string of length n");
		String S1=sc.next();
		System.out.println("enter the second string lenght n");
		String S2=sc.next();
		System.out.println("enter the third string");
		String S3=sc.next();
		char [] ch1=new char[S1.length()];
		char [] ch2=new char[S2.length()];
		char [] ch3=new char[S3.length()];
		for(int i=0;i<S1.length();i++)
		{
			ch1[i]=S1.charAt(i);
			ch2[i]=S2.charAt(i);
			ch3[i]=S3.charAt(i);
		}
		for(int i=0;i<S1.length();i++)
		{
			if(ch1[i]>ch2[i])
			{
				for(int j=0;j<S1.length();j++)
				{
					if(i!=j && ch1[i]==ch1[j])
					{
						ch1[j]=ch2[i];
					}
					if(i!=j && ch1[i]==ch2[j])
					{
						ch2[j]=ch2[i];
					}
				}
				ch1[i]=ch2[i];
			}
			else if(ch1[i]<ch2[i])
			{
				for(int j=0;j<S1.length();j++)
				{
					if(i!=j && ch2[i]==ch1[j])
					{
						ch1[j]=ch1[i];
					}
					if(i!=j && ch2[i]==ch2[j])
					{
						ch2[j]=ch1[i];
					}
				}
			}
		}
		for(int i=0;i<S3.length();i++)
		{
			for(int j=0;j<S2.length();j++)
			{
				if(ch3[i]==ch2[j])
				{
					ch3[i]=ch1[i];
				}
			}
		}
		System.out.println(ch3);
	}
}