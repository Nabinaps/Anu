package stringClass;

import java.util.Scanner;

public class Main_countVowelConsonant 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		int Cv=0;
		int Cc=0;
		for(int i=0;i<st.length();i++)
		{
			 char ch=st.charAt(i);
			 if(ch>='A'&&ch<='Z')
			 {
				 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					 Cv++;
				 else
					 Cc++;
			 }
			 else if(ch>='a'&&ch<='z')
			 {
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					 Cv++;
				 else
					 Cc++;
			 }
		}
		System.out.println("number of vowels is: "+Cv);
		System.out.println("number of consonant is: "+Cc);
	}
}
