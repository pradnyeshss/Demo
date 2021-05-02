package com.test.thread;

public class Derive extends Base {

	private void dis()
	{
		
	}
	

	public void dis1()
	{
		dis();
	}

	public static void main(String ar[])
	{
		Base b1 = new Derive(); 
	}
}
