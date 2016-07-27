package com.dongwt.java.problems.thread.demo;

public class Test {
	
	public static void main(String[] args){
		
		Task task = new Task(-1);
		
		Work work1 = new Work(0,"A",task);
		Work work2 = new Work(1,"B",task);
		Work work3 = new Work(2,"C",task);
		Produce produce = new Produce(10,task);
		
		new Thread(work1).start();
		new Thread(work2).start();
		new Thread(work3).start();
		new Thread(produce).start();
		
	}

}
