package com.test.thread;

public class TestThread {
	
	public synchronized void display()
	{
		
		System.out.println("This is diplay");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display1()
	{
		System.out.println("This is diplay 1");
	}
	
}
