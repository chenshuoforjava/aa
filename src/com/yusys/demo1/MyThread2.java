package com.yusys.demo1;

public class MyThread2 implements Runnable {

	int num;
	
	public MyThread2(int num) {  //通过构造方法对MyThread2类赋值
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			Thread thread = Thread.currentThread();
//			System.out.println(thread.getName() + ":" + i);

			System.out.println(Thread.currentThread().getName() + ":" + i+num);
		}
	}

}
