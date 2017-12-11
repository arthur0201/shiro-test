package com.test;

public class Price {
	
	final static Price INSTACE = new Price(2.8);
	
	static double initPrice = 20;
	
	double currentPrice;
	
	public Price(double discount){
		//根据静态变量计算实例变量
		currentPrice = initPrice - discount;
	}

}
