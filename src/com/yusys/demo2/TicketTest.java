package com.yusys.demo2;

public class TicketTest {
	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t1 = new Thread(tt);
		t1.setName("窗口1");
		t1.start();

		Thread t2 = new Thread(tt);
		t2.setName("窗口2");
		t2.start();
		
		Thread t3 = new Thread(tt);
		t3.setName("窗口3");
		t3.start();
		
		Thread t4 = new Thread(tt);
		t4.setName("窗口4");
		t4.start();
	}
}
