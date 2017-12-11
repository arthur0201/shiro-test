package com.hthl.test;

public class Dog implements Cloneable {

	private String name;
	private double weight;
	public Dog(String name, double weight){
		System.out.println("调用有参构造器");
		this.name = name;
		this.weight = weight;
	}

	public Object clone(){
		Dog dog = null;
		try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return dog;
		
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj.getClass() == Dog.class){
			Dog target = (Dog) obj;
			return target.name.equals(this.name) && target.weight == this.weight;
		}
		return false;
	}
	
	public int hashCode(){
		return name.hashCode() * 17 + (int) weight;
	}
	
}
