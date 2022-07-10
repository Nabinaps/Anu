package stringClass;

import java.util.Scanner;

public class Main_SwapFirstAndLastLetter 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String st=sc.nextLine();
		
		st=swap(st);
		System.out.println("after swapping");
		System.out.println(st);
	}

	private static String swap(String str) {
		char ch[]=str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				f=i;
			if(ch[i]!=' '&&i==ch.length-1 ||ch[i]!=' '&&ch[i+1]==' ')
			{
				char t=ch[f];
				ch[f]=ch[i];
				ch[i]=t;
			}
			str=new String(ch);
		}
		
		
		
		return str;
	}
}
