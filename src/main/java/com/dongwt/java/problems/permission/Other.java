package com.dongwt.java.problems.permission;

public class Other {
	
	public static final void main(String[] args){
		/**
		 * friendly权限是 当前类 和 同一个包中
		 * 不在同一个包中的子孙类都不能访问
		 */
		Super supers = new Super();
	}
}
