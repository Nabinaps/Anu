package stringClass;

import java.util.Scanner;

public class Main_CountDaysBetweenTwoDate 
{
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	Main_CountDaysBetweenTwoDate (int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
	}
	public int noOfDays()
	{
		int days=dd;
		for(int i=1;i<mm;i++)
			days=days+month[i];
		int y=yy-1;
		days=days+y*365+y/400+y/4-y/100;
		return days;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first date:(dd/mm/yyyy)");
		int dd1=sc.nextInt();
		int mm1=sc.nextInt();
		int yy1=sc.nextInt();
		Main_CountDaysBetweenTwoDate d1=new  Main_CountDaysBetweenTwoDate (dd1,mm1,yy1);
		System.out.println("enter second date:(dd/mm/yyyy)");
		int dd2=sc.nextInt();
		int mm2=sc.nextInt();
		int yy2=sc.nextInt();
		Main_CountDaysBetweenTwoDate d2=new  Main_CountDaysBetweenTwoDate (dd2,mm2,yy2);
		System.out.println("number of days btw "+d1+" and "+d2+" is:");
		int d=d2.noOfDays()-d1.noOfDays();
		System.out.println(d);
		int year=d/365;
		int month=(d%365)/30;
		int day=(d%365%30);
		
		System.out.println("your age is:");
		System.out.println(year+" years "+month+" months "+day+" days");
		
		
	
	
	}

}
