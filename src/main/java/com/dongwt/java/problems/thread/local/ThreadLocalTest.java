package com.dongwt.java.problems.thread.local;

//最常见的ThreadLocal使用场景为 用来解决 数据库连接、Session管理等。
public class ThreadLocalTest {
	private ThreadLocal<Long> longLocal = new ThreadLocal<Long>(); 
	private ThreadLocal<String> stringLocal = new ThreadLocal<String>(); 
	
	public void set(){
		longLocal.set(Thread.currentThread().getId());
		stringLocal.set(Thread.currentThread().getName());
	}
	
	public Long getLong(){
		return longLocal.get();
	}
	
	public String getString(){
		return stringLocal.get();
	}
	
	
	public static void main(String[] args) throws Exception{
		ThreadLocalTest test = new ThreadLocalTest();
		test.set();
		System.out.println(test.getLong());
		System.out.println(test.getString());
		
		Thread thread1 = new Thread(){
			public void run(){
				ThreadLocalTest test = new ThreadLocalTest();
				test.set();
				System.out.println(test.getLong());
				System.out.println(test.getString());
			}
		};
		
		thread1.start();
		thread1.join();
		
		System.out.println(test.getLong());
		System.out.println(test.getString());
		
	}
	
	
}
