package com.multithreading.demo;

public class ThreadDemo extends Thread{
	public void run() {
		System.out.println("run method is executed by JVM");
	}
	
	
	
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread t=new Thread(td);
		t.start();

	}

}
