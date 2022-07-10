package stringClass;

import java.util.Scanner;

public class Main_CountCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();

		int count[]=new int[st.length()];
		boolean b[]=new boolean[st.length()];

		st=st.toLowerCase();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
				count[i]=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count[i]++;
						b[j]=true;
					}
				}
				if (ch[i]!=' ')
				System.out.println(ch[i]+"=>"+count[i]);
			}
		}

	}
}
