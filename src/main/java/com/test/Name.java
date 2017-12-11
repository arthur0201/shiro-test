package com.test;

public class Name {
	
	private String first;
	private String last;
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o.getClass() == Name.class){
			Name  n = (Name) o;
			return n.first.equals(first) && n.last.equals(last);
		}
		return false;
	}


}
