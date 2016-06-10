package com.dongwt.java.problems.collection;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListJunit {
	private List<String> lists;
	
	@Before
	public void before(){
		lists = new LinkedList<String>();
		lists.add("aaa");
		lists.add("bbb");
		lists.add("aaa");
		lists.add("ccc");
		lists.add("bbb");
	}
	
	@Test
	public void removeDuplicate1(){
		System.out.println("removeDuplicate1");
		System.out.println(ListUtils.removeDuplicate1(lists));
	}
	
	@Test
	public void removeDuplicate2(){
		System.out.println("removeDuplicate2");
		System.out.println(ListUtils.removeDuplicate2(lists));
	}

}
