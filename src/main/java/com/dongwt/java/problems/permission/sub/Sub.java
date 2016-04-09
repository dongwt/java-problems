package com.dongwt.java.problems.permission.sub;

import com.dongwt.java.problems.permission.Super;

public class Sub extends Super{
	
	/**
	 * friendly权限是 当前类 和 同一个包中
	 * 不在同一个包中的子孙类都不能访问
	 */
//	Sub(){
//		super();
//	}
	
	Sub(){
		super(1);
	}
}
