package com.test;

public class PriceTest {

	public static void main(String[] args){
		//ͨ��Price��INSTACE������currentPrice
		System.out.println(Price.INSTACE.currentPrice);
		//��ʾ����priceʵ��
		Price price = new Price(2.8);
		//ͨ����ʾ������priceʵ��������currentPrice
		System.out.println(price.currentPrice);
	}
}
