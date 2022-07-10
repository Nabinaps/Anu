package stringClass;

import java.util.Scanner;

public class Main_frequencyOfEachCharacter 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			count[ch]++;
		}
		for(int k=0;k<128;k++)
		{
			if(count[k]!=0)
			{
				System.out.println((char)k+"=>"+count[k]);
			}
		}
	}
}
