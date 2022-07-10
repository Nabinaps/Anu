package String;
/*
 * Given a string, s, and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
 */

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindTheSmallestAndLargestSubStringOfGivenStringOfLengthK {

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        smallest=s.substring(0, k);
	       largest=s.substring(0, k);
	         //SortedSet<String> sets=new TreeSet<String>();
	    for(int i=0;i<=s.length()-k;i++){
	        if(s.substring(i,i+k).compareTo(largest)>0)
	        {
	        	largest=s.substring(i,i+k);
	        }
	        if(s.substring(i,i+k).compareTo(smallest)<0)
	        {
	        	smallest=s.substring(i,i+k);
	        }
	    }
	   // smallest=sets.first();
	   // largest=sets.last();
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}

/* another method
 *  String str=scan.next();
    int k=scan.nextInt();
    SortedSet<String> sets=new TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
 */

