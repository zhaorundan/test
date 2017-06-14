package org.zhao.test.pettern.decorator;

public class B1 extends B {

	public B1(A a) {
		super(a);
	}

	@Override
	public String desc() {
		return "b1," + a.desc();
	}

	@Override
	public int cost() {
		return 10+a.cost();
	}

}
