package stringClass;

import java.util.Scanner;

public class Main_countCapitalSmallLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		int Caps=0;
		int Small=0;
		for(int i=0;i<st.length();i++)
		{
			 char ch=st.charAt(i);
			 if(ch>='A'&&ch<='Z')
				 Caps++;
			 else if(ch>='a'&&ch<='z')
			 Small++;
		}
		System.out.println("number of capital letters is: "+Caps);
		System.out.println("number of small letters is: "+Small);
	}
}
