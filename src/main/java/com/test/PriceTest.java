package com.test;

public class PriceTest {

	public static void main(String[] args){
		//通过Price的INSTACE来访问currentPrice
		System.out.println(Price.INSTACE.currentPrice);
		//显示创建price实例
		Price price = new Price(2.8);
		//通过显示创建的price实例来访问currentPrice
		System.out.println(price.currentPrice);
	}
}
