package stringClass;

import java.util.Scanner;

public class Main_convertAllToLower {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String res=lower(st);
		System.out.println("after covert to lowercase");
		System.out.println(res);
	}

	public static String lower(String str) 
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		str=new String(ch);
		return str;
	}
}
