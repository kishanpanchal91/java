package com.java.thread;

import java.util.function.Consumer;

public class DeadLock {
	public static void main(String[] args) {

		//deadlock 
	 	String resource1="Thread1";
	 	String resource2="Thread2";
		
	 	//Thread 1 access resource 1 and then resource 2
	 	//Thread 2 access resource 2 and then resource  1
	 	//so Thread 1 waiting for resource 2 and Thread 2 is waiting for Resource 1 so it's call deadLock
	 	
		A a = new A();
		Thread thread = new Thread() {

			@Override
			public void run() {
				synchronized (resource1) {
					
					try {
						a.print();
						Thread.sleep(100);
						synchronized (resource2) {
							a.display();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}

		};

		Thread thread1 = new Thread() {

			@Override
			public void run() {
				synchronized (resource2) {
					try {
						a.display();
						Thread.sleep(100);
						synchronized (resource1) {
							a.print();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}

		};

		thread.start();
		thread1.start();

	}
}

class A {
	public void print() {
		System.out.println("Thread 1: locked resource 1 Printing" +Thread.currentThread().getClass());
	}

	public void display() {
		System.out.println("Thread 2: locked resource 1 Display" +Thread.currentThread().getClass());
	}
}
