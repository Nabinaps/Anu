package stringClass;

import java.util.Scanner;

public class Main_ConvertAmountNumberToWord 
{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();
			
			convert(n/10000000,"crore");
			convert(n/100000%100,"lakh");
			convert(n/1000%100,"thousand");
			convert(n/100%10,"hundred");
			convert(n%100,"");
		}

		private static void convert(int x, String st) 
		{
			if(x==0)
				return;
			String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String two[]= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
			
			if(x<20)
				System.out.print(one[x]+" ");
			else
				System.out.print(two[x/10]+one[x%10]+" ");
			System.out.print(st+" ");
		}

}
