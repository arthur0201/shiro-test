package com.hthl.test;

public class CloneTest {

	public static void main(String[] args) {
		Dog dog = new Dog("Blot", 9.8);
		System.out.println("对象创建完成~");
		Dog dog2 = (Dog) dog.clone();
		System.out.println(dog.equals(dog2));
		System.out.println(dog2 == dog);
	}

}
