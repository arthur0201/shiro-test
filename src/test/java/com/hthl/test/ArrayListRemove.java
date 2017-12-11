package com.hthl.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("111");
		list.add("222");
		list.add("333");
		System.out.println(list);
		for(Iterator<String> it = list.iterator(); it.hasNext(); ){
			String ele = it.next();
			if(ele.equals("222")){
				list.remove(ele);
			}
		}
		System.out.println(list);
	}

}
