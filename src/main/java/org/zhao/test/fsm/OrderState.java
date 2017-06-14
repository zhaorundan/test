package org.zhao.test.fsm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class OrderState {
	protected static final Map<String, String> subOrderStatus = new HashMap<String, String>();
	protected static final Map<String, String> goodsStatus = new HashMap<String, String>();
	private SubOrder subOrder ;
	private List<Goods> goodses;
	public OrderState(SubOrder subOrder,List<Goods> goodses){
		setSubOrder(subOrder);
		setGoodses(goodses);
	}
	public SubOrder getSubOrder() {
		return subOrder;
	}
	public void setSubOrder(SubOrder subOrder) {
		if(subOrder==null){
			throw new RuntimeException("子订单不能为空");
		}
		this.subOrder = subOrder;
	}
	public List<Goods> getGoodses() {
		return goodses;
	}
	public void setGoodses(List<Goods> goodses) {
		if( goodses == null || !goodses.isEmpty()){
			throw new RuntimeException("商品不能为不能为空");
		}
		this.goodses = goodses;
	}
	
	public OrderState checkSubOrderState(){
		subOrderStatus.keySet().contains("");
		return this;
	}
	public OrderState checkGoodsState(){
		return this;
	}
}
