package String;
/*
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 */

import java.util.Scanner;

public class Main_SplitGivenStringOnAnySpecialCharacter {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       String string = scanner.nextLine().trim();
	       scanner.close();
	       
	       if(string.isEmpty())
	    	   System.out.println("0");
	       
	       else
	       {
	    	   String[] array = string.split("[ !,?\\.\\_'@]+");
		       
		       System.out.println(array.length);
		       
		       for(int i = 0; i < array.length && array[i] != null; ++ i)
		    	   System.out.println(array[i]);
		   }
	}
}
