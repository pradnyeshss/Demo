package com.test.thread;

public class MasterThread implements Runnable{

	TestThread t1 = new TestThread();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t1.display();
		
	}

}
