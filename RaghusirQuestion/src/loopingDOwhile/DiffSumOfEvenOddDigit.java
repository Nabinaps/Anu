package loopingDOwhile;

import java.util.Scanner;

public class DiffSumOfEvenOddDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int res=difference(num);
		System.out.println("difference is "+res);
	}

 static int difference(int x) {
	int sumOfEven=0;
	int sumOfOdd=0;
	int differ=0;
	do{
		int r=x%10;
		if(r%2==0)
			sumOfEven=sumOfEven+r;
		else
			sumOfOdd=sumOfOdd+r;
			
		x=x/10;
		
	}while(x!=0);
	if(sumOfEven>sumOfOdd)
	 differ=sumOfEven-sumOfOdd;
	else
		differ=sumOfOdd-sumOfEven;
		return differ;
	}
}
