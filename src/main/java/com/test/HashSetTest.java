package com.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<Name> s =  new HashSet<Name>();
		s.add(new Name("abc","123"));
		System.out.println(s.contains(new Name("abc","123")));
	}

}
