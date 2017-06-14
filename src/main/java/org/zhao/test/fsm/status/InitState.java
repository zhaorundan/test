package org.zhao.test.fsm.status;

import java.util.List;

import org.zhao.test.fsm.Goods;
import org.zhao.test.fsm.OrderState;
import org.zhao.test.fsm.SubOrder;

public class InitState extends OrderState{
	public InitState(SubOrder subOrder, List<Goods> goodses) {
		super(subOrder, goodses);
	}
	 
}
