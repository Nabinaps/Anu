package stringClass;

import java.util.Scanner;

public class Main_conversionUpperToLowerViceversa {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String res=convertion(st);
		System.out.println("after covertion");
		System.out.println(res);
	}

	public static String convertion(String str) 
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			else if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		str=new String(ch);
		return str;
	}
}
