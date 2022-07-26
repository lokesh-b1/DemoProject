package com.multithreading.demo;

public class MultiDemo1 implements Runnable{

public void run() {
	Thread t= Thread.currentThread();
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		MultiDemo m1=new MultiDemo();
		Thread t1=new Thread(m1);
		t1.start();
		
		Thread t= Thread.currentThread();
		System.out.println(t);
	}
}
