package com.navin;

public class Dog {
	int price;
	String breed;
	String origin;
	int height;
	String color;
	Dog(int price,String breed,String origin,int height,String color)
	{
		this.price=price;
		this.breed=breed;
		this.origin=origin;
		this.height=height;
		this.color=color;
	}
	Dog(int price,String origin,int height,String color)
	{
		this.color=color;
		this.price=price;
		this.origin=origin;
		this.height=height;
	}
	Dog(int price,int height,String color)
	{
		this.color=color;
		this.price=price;
		this.height=height;
	}
	Dog(int price,String color)
	{
		this.color=color;
		this.price=price;
	}
	public void details()
	{
		System.out.println("price is "+price);
		System.out.println("breed is "+breed);
		System.out.println("origin is "+origin);
		System.out.println("height is "+height);
		System.out.println("color is "+color);
	}
	public static void main(String []args)
	{
		Dog d1=new Dog(2000,"bulldog","europe",50,"white");
		d1.details();
		Dog d2=new Dog(5000,"africa",50,"black");
		d2.details();
		Dog d3=new Dog(1005,40,"brown");
		d3.details();
		Dog d4=new Dog(5235,"gold");
		d4.details();
	}

}
