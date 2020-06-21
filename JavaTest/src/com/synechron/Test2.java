package com.synechron;

public class Test2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "Started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Finished");
		});
		
		Thread t2 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "Started");
			try {
				Thread.sleep(2000);
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Finished");
			
		});
		
		Thread t3 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "Started");
			try {
				Thread.sleep(2000);
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "Finished");
		});
		
		Thread t4 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "Started");
			try {
				Thread.sleep(2000);
				t3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "Finished");
		});
		
		Thread t5 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + "Started");
			try {
				Thread.sleep(2000);
				t4.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "Finished");
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
