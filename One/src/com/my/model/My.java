package com.my.model;

import java.util.ArrayList;

class Student
{
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	private int a,b;
}
public class My {

	public static void main(String[] args) {
		
		ArrayList<Student> y=new ArrayList<Student>();
		for(int i=0;i<5;i++)
		{
			Student n=new Student();
			n.setA(12);
			n.setB(18);
			y.add(n);
		}
		for(Student a:y)
		{
			System.out.println(a);
		}
		
		
	}

}
