package stringClass;

import java.util.Scanner;

public class Main_indexOfSecondOccuranceOfChar 
{
	public static void main(String[] args) 
	{
		String st="java is very easy programing language";
		
		int f1=st.indexOf("a");//first occurance
		System.out.println(f1);
		//OR
		System.out.println(st.indexOf("a"));
		int f2=st.indexOf("a",f1+1);
		//OR
		int ff2=st.indexOf('a',st.indexOf('a')+1);
		System.out.println();
	}
}
