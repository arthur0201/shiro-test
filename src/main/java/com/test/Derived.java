package com.test;

public class Derived extends Base {
	int count = 20;
	
	@Override
	public void display(){
		System.out.println(this.count);
	}
}