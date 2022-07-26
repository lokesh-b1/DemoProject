package com.multithreading.demo;

class Customer {

	int amount=10000;
	
	public synchronized void withdraw(int amount) {
		
		System.out.println("Going to withdraw");
		if (this.amount<amount){
			System.out.println("Less Balance waiting to deposit");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("Withdraw completed");
	}
	public synchronized void deposit(int amount) {
		System.out.println("Going to deposit");
		this.amount=this.amount+amount;
		System.out.println("deposit completed");
		notify();
		
	}
}
	public class InterThreadDemo {
	
	public static void main(String[] args) {
		Customer c=new Customer();
		new Thread()
		{
			public void run() {
				c.withdraw(25000);
			}
			
		}	.start();
		
		new Thread()
		{
			public void run() {
				c.deposit(10000);
			}
			
		}	.start();
		}

}
