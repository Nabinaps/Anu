package stringClass;

import java.util.Scanner;

public class Main_NameOfGivenDate 
{
	int d,m,y;
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]= {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
	
	Main_NameOfGivenDate(int d,int m,int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
		if(y%400==0||y%4==0&&y%100!=0)
			month[2]=29;
	}
	public int noOfDay()
	{
		int days=d;
		for(int i=1;i<m;i++)
		{
			days=days+month[i];
		}
		int y1=y-1;
		days=days+y1*365+y1/400+y1/4-y1/100;
		return days;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first date:(dd/mm/yyyy)");
		int dd1=sc.nextInt();
		int mm1=sc.nextInt();
		int yy1=sc.nextInt();
		Main_NameOfGivenDate d1=new  Main_NameOfGivenDate (dd1,mm1,yy1);
		int a=d1.noOfDay();
		int a1=a%7;
		System.out.println("day name is:");
		System.out.println(d1.dname[a1]);
	}

}
