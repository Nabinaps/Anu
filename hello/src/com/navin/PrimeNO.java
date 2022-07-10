package com.navin;

import java.util.Scanner;

public class PrimeNO { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in); 
		System.out.println("pls enter the number of array store"); 
		int n=sc.nextInt(); 
		int x[]=new int [n]; 
		System.out.println("enter "+" the value"); 
		for(int i=0;i<n;i++) { 
			x[i]=sc.nextInt(); 
		} 
		System.out.println("value enter by user"); 
		for(int i=0;i<x.length;i++) { 
			System.out.println(x[i]); 
		} 
		System.out.println("total prime number is : "); 
		int c=countprime(x); 
		System.out.println( c); 
	} 

	private static int countprime(int[] x) { 
		int count=0; 
		for(int i=0;i<x.length;i++) { 
			boolean p=isprimenum(x[i]); 
			if(p==true) 
				count++; 
		} 
		return count; 
	} 

	private static boolean isprimenum(int y) { 
		for(int i=2;i<=y/2;i++) { 
			if(y%i==0) 
				return false; 
		} 
		return true ; 
	}
} 