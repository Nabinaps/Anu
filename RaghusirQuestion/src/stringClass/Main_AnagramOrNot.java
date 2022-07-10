package stringClass;

import java.util.Scanner;

public class Main_AnagramOrNot 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean angram=isAnagram(s1,s2);
	}

	private static boolean isAnagram(String s1, String s2) {
		int c1[]=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				c1[ch-65]++;
			}
			else if(ch>='a' && ch<='z')
			{
				c1[ch-97]++;
			}
		}
		int c2[]=new int[26];
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				c2[ch-65]++;
			}
			else if(ch>='a' && ch<='z')
			{
				c2[ch-97]++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
}
