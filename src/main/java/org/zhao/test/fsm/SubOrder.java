package org.zhao.test.fsm;

import java.util.List;

public class SubOrder {
	private int status;
	private List<Goods> goodses;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Goods> getGoodses() {
		return goodses;
	}
	public void setGoodses(List<Goods> goodses) {
		this.goodses = goodses;
	}
	
}
