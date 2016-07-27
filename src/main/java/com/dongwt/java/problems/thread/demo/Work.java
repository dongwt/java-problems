package com.dongwt.java.problems.thread.demo;

public class Work implements Runnable {
	private Integer id;
	private String name;
	private Task task;

	public Work(){};
	
	public Work(Integer id, String name,Task task) {
		this.id = id;
		this.name = name;
		this.task = task;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (task) {
					while (!task.isEqual(id)) {
						task.wait();
					}
					task.doing(name);
					task.setId(-1);
					task.notifyAll();
					 if (name.equalsIgnoreCase("c")) System.out.println();  
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
