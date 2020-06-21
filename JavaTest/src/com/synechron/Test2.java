package com.synechron;

public class Test2 {

	/**
	 * Write a program with N thread where thread should be running separately but their
	 * execution should finish in sequence , generate the output like where thread finishing in
	 * sequence though their start was not.
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " Started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Finished");
		});
		
		Thread t2 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " Started");
			try {
				Thread.sleep(2000);
				//t2 thread will wait for t1 to finish its execution
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " Finished");
			
		});
		
		Thread t3 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " Started");
			try {
				Thread.sleep(2000);
				//t3 thread will wait for t2 to finish its execution
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " Finished");
		});
		
		Thread t4 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " Started");
			try {
				Thread.sleep(2000);
				//t4 thread will wait for t3 to finish its execution
				t3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " Finished");
		});
		
		Thread t5 = new Thread(()->{
			System.out.println(Thread.currentThread().getName() + " Started");
			try {
				Thread.sleep(2000);
				//t5 thread will wait for t4 to finish its execution
				t4.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " Finished");
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
