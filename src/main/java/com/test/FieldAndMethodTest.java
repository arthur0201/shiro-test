package com.test;

public class FieldAndMethodTest {

	public static void main(String[] args){
		Base b = new Base();
		System.out.println(b.count);
		b.display();
		Derived d = new Derived();
		System.out.println(d.count);
		d.display();
		Base db = new Derived();
		System.out.println(db.count);
		db.display();
		Base d2b = d;
		System.out.println(d2b.count);
	}

}
