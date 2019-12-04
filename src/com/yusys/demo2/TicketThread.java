package com.yusys.demo2;

//代码块前加synchronized
//方法前加synchronized
public class TicketThread implements Runnable {

	static int ticket = 100;
//	Object obj = new Object();

	@Override
	public void run() {
		while (true) {
//			synchronized (TicketThread.class) {
//				method();
//			}
			method();
		}
	}

	private synchronized void method() {
		if (ticket > 0) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}

	private static synchronized void method2() {
		if (ticket > 0) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}

}
