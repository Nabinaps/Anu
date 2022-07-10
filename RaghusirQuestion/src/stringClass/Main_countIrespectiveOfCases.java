package stringClass;

import java.util.Scanner;

public class Main_countIrespectiveOfCases 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch[]=st.toCharArray();
			if(ch[i]>='a' && ch[i]<='z')
				count[ch[i]-97]++;
			else if(ch[i]>='A' && ch[i]<='Z')
				count[ch[i]-65]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65)+"=>"+count[i]);
		}
	}
}
