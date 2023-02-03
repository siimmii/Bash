package com.upcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//upcasting
		Son s1=new Son();
		System.out.println("------------");
		System.out.println(s1.age);
		   Father f=new Son();
		   System.out.println("age"+f.age);
		   //cte System.out.println("age"+f.name);
		   //downcatsing
		   Son s=(Son)f;
		   System.out.println("age"+s.age);
		   System.out.println("age"+s.name);
	}

}
