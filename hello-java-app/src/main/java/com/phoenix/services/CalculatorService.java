package com.phoenix.services;

import com.phoenix.math.Calculator;
/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @copyright Sterlite Technologies Ltd.
 * @creation date 22-jul-2021
 */
public class CalculatorService {
	private Calculator calc;
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorService(Calculator calc) {
		super();
		this.calc = calc;
	}

	public Calculator getCalc() {
		return calc;
	}

	public void setCalc(Calculator calc) {
		this.calc = calc;
	}
	
	public int addition(int x,int y) {
		return calc.add(x, y);
	}
	
}
