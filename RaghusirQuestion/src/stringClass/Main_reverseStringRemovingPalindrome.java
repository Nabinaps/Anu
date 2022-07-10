package stringClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_reverseStringRemovingPalindrome {
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
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> ans=new ArrayList<String>(n);
		sc.nextLine();
		while(n>0)
		{
			String st=sc.nextLine();
			String word[]=st.split(" ");
			st=" ";
			for(int i=0;i<word.length;i++)
			{
				if(isPalindrom(word[i])==true)
				{
					continue;
				}
				else
				{
					for(int j=word[i].length()-1;j>=0;j--)
					{
						st=st+word[i].charAt(j);
					}
					st=st+" ";
				}

			}
			ans.add(st);
			n--;
		}
		for(Object ob:ans)
		{
			System.out.println(ob);
		}
	}
}
