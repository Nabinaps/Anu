package stringClass;

import java.util.Scanner;

public class Main_countWords {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int count=getCount(st);
		System.out.println("number of words present is: ");
		System.out.println(count);
	}

	public static int getCount(String str) 
	{
		
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;
		}
		return count;
	}
}
