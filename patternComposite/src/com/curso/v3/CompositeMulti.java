package com.curso.v3;

//                          IS-A
public class CompositeMulti implements Component {
	
	//HAS-A
	Component comLeft;
	Component comRight;
	
	public CompositeMulti(
			Component comLeft, Component comRight) {
		this.comLeft = comLeft;
		this.comRight = comRight;
	}

	@Override
	public double getValue() {
		return comLeft.getValue() * comRight.getValue() ;
	}

}
