package com.multithreading.demo;

public class MultiDemo2 implements Runnable{
	String name;

	public MultiDemo2(String name) {
	super();
	this.name = name;
}
	public void run() {
		for (int i = 1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e); 
			}
			
			System.out.println(name+ ":"+i);
		}
		
	} 

	public static void main(String[] args) { 
		MultiDemo2 m1=new MultiDemo2("Thread1");
		MultiDemo2 m2=new MultiDemo2("Thread2");
		
		Thread t1=new Thread(m1);	
		Thread t2=new Thread(m2);
		
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		for (int i = 0; i<=10; i++) {
		System.out.println("main :"+i);
		}
		
		
		}

	}



