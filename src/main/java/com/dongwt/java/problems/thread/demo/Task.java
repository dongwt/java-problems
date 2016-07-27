package com.dongwt.java.problems.thread.demo;

public class Task {

	private Integer id;// 任务id

	public Task() {
	};

	public Task(Integer id) {
		this.id = id;
	};

	public boolean isEqual(Integer id) {
		return this.id.intValue() == id.intValue();
	}
	
	public void doing(String name){
		System.out.print(name);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
