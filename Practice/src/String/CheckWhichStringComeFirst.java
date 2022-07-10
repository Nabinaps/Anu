package String;
/*
 * Given two strings of lowercase English letters, A and B , perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

import java.util.Scanner;

public class CheckWhichStringComeFirst {
	 public static void main(String[] args) {
	        System.out.println("enter two string");
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length()+B.length());
	        int i=0;
	        while(i<A.length())
	        {
	        		if(A.charAt(i)>B.charAt(i))
	        		{
	        			System.out.println("Yes");
	        			break;
	        		}
	        		else if(A.charAt(i)==B.charAt(i))
	        		{
	        			if(A.equals(B))
	        			{
	        				System.out.println("No");
	        				break;
	        			}
	        			i++;
	        		}
	        		else
	        		{
	        			System.out.println("No");
	        			break;
	        		}
	        	
	        }
	        // another method
	        System.out.println(A.compareTo(B)>0?"Yes":"No");
	        
	        
	        
	        //to make first letter of each string capital
	        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
	 }
}
