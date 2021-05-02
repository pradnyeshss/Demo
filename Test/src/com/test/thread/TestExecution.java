package com.test.thread;

public class TestExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new MasterThread());
		t1.run();
		
		Thread t2 = new Thread(new MasterThread2());
		t2.run();

	}

}
