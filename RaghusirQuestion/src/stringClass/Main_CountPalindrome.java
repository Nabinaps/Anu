package stringClass;

import java.util.Scanner;

public class Main_CountPalindrome 
{
	static boolean isPalindrom(String str)
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String st=sc.nextLine();
		int count=isCount(st);
		System.out.println("number of palindrom words is: "+count);
	}
	private static int isCount(String st) {
		String word[]=st.split(" ");
		int c=0;
		for(int i=0;i<word.length;i++)
		{
			if(isPalindrom(word[i])==true)
			{
				System.out.println("palindrom words are: ");
				System.out.println(word[i]);
				c++;
			}
		}
		return c;
	}
}
