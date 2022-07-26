package com.multithreading.demo;

public class MultiDemo implements Runnable{
	int count;
	public synchronized void run() {
		
		for (int i = 1; i<=10000; i++) {
			count++;
			
		}
	}
	
	public static void main(String[] args) {
		
		MultiDemo m1=new MultiDemo(); 
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		System.out.println(t1.isAlive());
		
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		
		System.out.println(Thread.currentThread().isDaemon());
		
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		
		t1.setName("My Thread 1");
		t2.setName("My Thread 2");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(1);
		t2.setPriority(9);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m1.count);
	}

}
