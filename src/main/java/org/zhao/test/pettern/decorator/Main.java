package org.zhao.test.pettern.decorator;

public class Main {
	public static void main(String[] args) {
		
		A a = new A1();
		System.out.println(a.desc());
		System.out.println(a.cost());
		B b = new B1(a);
		b.desc();
		System.out.println(b.desc());
		System.out.println(b.cost());
		B b2 = new B1(b);
		System.out.println(b2.desc());
		System.out.println(b2.cost());
	}
}
