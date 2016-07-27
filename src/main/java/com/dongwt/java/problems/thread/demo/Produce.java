package com.dongwt.java.problems.thread.demo;

public class Produce implements Runnable {

	private Integer count;
	private Task task;

	public Produce() {
	};

	public Produce(Integer count, Task task) {
		this.count = count;
		this.task = task;
	};

	@Override
	public void run() {

		try {
			while (count > 0) {
				int num = 10 - this.count + 1;
				synchronized (task) {
					for (int i = 0; i < 3; i++) {
						while (!task.isEqual(-1)) {
							task.wait();
						}
						task.setId(i);
						task.notifyAll();
					}
				}
				count--;
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
