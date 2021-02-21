package com.implementaion;

public class CalculatorModel implements CalculatorImpl{
	
	private double param1;
	private double param2;
	
	public CalculatorModel() {
		
	}
	
	CalculatorModel(double param1, double param2){
		this.param1 = param1;
		this.param2 = param2;
	}

	public double getParam1() {
		return param1;
	}

	public void setParam1(double param1) {
		this.param1 = param1;
	}

	public double getParam2() {
		return param2;
	}

	public void setParam2(double param2) {
		this.param2 = param2;
	}
	
	@Override
	public void add(double param1, double param2) {
		this.param1 = param1;
		this.param2 = param2;
		double res = param1 + param2;
		System.out.println(" Added Result is : "+ res);
	}

	@Override
	public void substract(double param1, double param2) {
		this.param1 = param1;
		this.param2 = param2;
		double res = param1 - param2;
		System.out.println(" Substracted Result is : "+ res);
	}

	@Override
	public void multiply(double param1, double param2) {
		this.param1 = param1;
		this.param2 = param2;
		double res = param1 * param2;
		System.out.println(" Multiplied Result is : "+ res);
	}

	@Override
	public void divide(double param1, double param2) {
		this.param1 = param1;
		this.param2 = param2;
		double res = param1 / param2;
		System.out.println(" Divided Result is : "+ res);
	}

}
