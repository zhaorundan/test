package org.zhao.test.pettern.decorator;

public abstract class B extends A {
	A a ;
	public B(A a){
		this.a = a;
	}
	public abstract String desc();
	public abstract int cost();
}
